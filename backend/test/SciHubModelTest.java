package models;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A1: Setup, Test, and Understand
 * Individual Task: JUnit Test for Existing Model Functionality
 */
public class SciHubModelTest {

    @Test
    public void testFacultyProfile() {
        // 1. Arrange: Create a new faculty instance
        // Assuming the constructor follows (Name, Department)
        Faculty faculty = new Faculty("Dr. Smith", "Computer Science");

        // 2. Act: Retrieve the department
        String department = faculty.getDepartment();

        // 3. Assert: Verify the department matches the input
        assertEquals("The department should be Computer Science", "Computer Science", department);
    }

    @Test
    public void testFacultyNameInitialization() {
        Faculty faculty = new Faculty("Dr. Choi", "Engineering");

        // Ensure the object isn't null and name is stored correctly
        assertNotNull("Faculty object should be instantiated", faculty);
        assertEquals("Dr. Choi", faculty.getName());
    }
}