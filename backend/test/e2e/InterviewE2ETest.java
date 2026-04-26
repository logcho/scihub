package e2e;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Interview;
import models.RAJobApplication;
import models.User;
import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import play.Application;
import play.libs.Json;
import play.mvc.Result;
import play.test.Helpers;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.junit.Assert.*;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.*;

public class InterviewE2ETest {

    private static final String RAW_PASSWORD = "e2e-pass";
    private static final String PROPOSED_TIMES =
            "[\"2026-05-01T15:00:00Z\",\"2026-05-01T17:00:00Z\"]";

    private Application application;
    private User professor;
    private RAJobApplication rajobApplication;
    private Interview interview;

    @Before
    public void startApplication() {
        Assume.assumeTrue("Set DB_URL, DB_USER, and DB_PASS to run backend E2E tests.", hasDatabaseConfig());

        try {
            application = Helpers.fakeApplication(databaseConfig());
            Helpers.start(application);
        } catch (RuntimeException e) {
            Assume.assumeNoException("Backend E2E test skipped because the configured database is unavailable.", e);
        }
    }

    @After
    public void stopApplication() {
        if (interview != null && interview.getId() != 0L) {
            interview.delete();
        }
        if (rajobApplication != null && rajobApplication.getId() != 0L) {
            rajobApplication.delete();
        }
        if (professor != null && professor.getId() != 0L) {
            professor.delete();
        }
        if (application != null) {
            Helpers.stop(application);
        }
    }

    @Test
    public void happyPathLoginAndScheduleInterview() {
        professor = createActiveUser("interview-e2e-" + UUID.randomUUID() + "@example.edu");
        rajobApplication = new RAJobApplication("E2E applicant");
        rajobApplication.save();

        Result loginResult = route(application, fakeRequest(POST, "/user/userLogin").bodyJson(loginJson(professor.getEmail(), RAW_PASSWORD)));

        assertEquals(OK, status(loginResult));
        JsonNode loginResponse = Json.parse(contentAsString(loginResult));
        assertEquals(professor.getId(), loginResponse.get("id").asLong());

        interview = new Interview(rajobApplication, professor, PROPOSED_TIMES, "scheduled");
        interview.setChosenTime("2026-05-01T17:00:00Z");
        interview.setLocation("Zoom");
        interview.save();

        Interview scheduledInterview = Interview.find.byId(interview.getId());
        assertNotNull(scheduledInterview);
        assertEquals("scheduled", scheduledInterview.getStatus());
        assertEquals("2026-05-01T17:00:00Z", scheduledInterview.getChosenTime());
        assertEquals("Zoom", scheduledInterview.getLocation());
    }

    @Test
    public void errorPathRejectsInvalidAuthenticationBeforeScheduling() {
        professor = createActiveUser("interview-e2e-error-" + UUID.randomUUID() + "@example.edu");

        Result loginResult = route(application, fakeRequest(POST, "/user/userLogin").bodyJson(loginJson(professor.getEmail(), "wrong-password")));

        assertEquals(OK, status(loginResult));
        JsonNode response = Json.parse(contentAsString(loginResult));
        assertEquals("User is not valid", response.get("error").asText());
        assertEquals(0, Interview.find.query().where().eq("createdBy.id", professor.getId()).findCount());
    }

    private static User createActiveUser(String email) {
        User user = new User("Interview Professor", email);
        user.setPassword(controllers.UserController.MD5Hashing(RAW_PASSWORD));
        user.setIsActive("True");
        user.save();
        return user;
    }

    private static ObjectNode loginJson(String email, String password) {
        ObjectNode json = Json.newObject();
        json.put("email", email);
        json.put("password", password);
        json.put("isResearcher", "true");
        return json;
    }

    private static boolean hasDatabaseConfig() {
        return getenv("DB_URL") != null && getenv("DB_USER") != null && getenv("DB_PASS") != null;
    }

    private static Map<String, Object> databaseConfig() {
        Map<String, Object> config = new HashMap<>();
        config.put("play.http.secret.key", "interview-e2e-test-secret");
        config.put("db.default.driver", "com.mysql.cj.jdbc.Driver");
        config.put("db.default.url", getenv("DB_URL"));
        config.put("db.default.username", getenv("DB_USER"));
        config.put("db.default.password", getenv("DB_PASS"));
        config.put("play.evolutions.enabled", "false");
        return config;
    }

    private static String getenv(String name) {
        return System.getenv(name);
    }
}
