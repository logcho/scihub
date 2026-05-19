package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class InterviewTest {

    private static final String PROPOSED_TIMES =
            "[\"2026-05-01T15:00:00Z\",\"2026-05-02T16:00:00Z\"]";

    @Test
    public void constructorStoresRequiredInterviewDetails() {
        RAJobApplication application = new RAJobApplication("Research assistant applicant");
        User creator = new User("Professor Lane", "professor.lane@example.edu");

        Interview interview = new Interview(application, creator, PROPOSED_TIMES, "proposed");

        assertSame(application, interview.getRajobApplication());
        assertSame(creator, interview.getCreatedBy());
        assertEquals(PROPOSED_TIMES, interview.getProposedTimes());
        assertEquals("proposed", interview.getStatus());
        assertNotNull(interview.getCreatedTime());
        assertFalse(interview.getCreatedTime().trim().isEmpty());
        assertNotNull(interview.getUpdatedTime());
        assertFalse(interview.getUpdatedTime().trim().isEmpty());
    }

    @Test
    public void defaultConstructorSupportsPopulatingOptionalFields() {
        Interview interview = new Interview();

        interview.setChosenTime("2026-05-01T15:00:00Z");
        interview.setLocation("Science Building 210");
        interview.setNotes("Bring portfolio and transcript.");
        interview.setStatus("scheduled");

        assertEquals("2026-05-01T15:00:00Z", interview.getChosenTime());
        assertEquals("Science Building 210", interview.getLocation());
        assertEquals("Bring portfolio and transcript.", interview.getNotes());
        assertEquals("scheduled", interview.getStatus());
    }

    @Test
    public void constructorLeavesSchedulingDecisionFieldsUnset() {
        Interview interview = new Interview(new RAJobApplication(42L), new User(7L), PROPOSED_TIMES, "proposed");

        assertEquals(0L, interview.getId());
        assertNull(interview.getChosenTime());
        assertNull(interview.getLocation());
        assertNull(interview.getNotes());
    }

    @Test
    public void finderIsAvailableForPersistenceQueries() {
        assertNotNull(Interview.find);
    }
}
