
package business;

import data.RegistrationRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CancelRegistrationServiceTest {

    // Test a valid student ID
    @Test
    void testValidStudentId() {
        RegistrationRepository repo = new RegistrationRepository();
        CancelRegistrationService service = new CancelRegistrationService(repo);

        assertTrue(service.isValidStudentId("202308643"));
        assertFalse(service.isValidStudentId("ABC"));
        assertFalse(service.isValidStudentId(""));
    }

    // Test a valid event ID
    @Test
    void testValidEventId() {
        RegistrationRepository repo = new RegistrationRepository();
        CancelRegistrationService service = new CancelRegistrationService(repo);

        assertTrue(service.isValidEventId("EV001"));
        assertFalse(service.isValidEventId("123"));
        assertFalse(service.isValidEventId(""));
    }

    // Test successful cancellation
    @Test
    void testSuccessfulCancellation() {
        RegistrationRepository repo = new RegistrationRepository();
        repo.addRegistration("202308643", "EV001");

        CancelRegistrationService service = new CancelRegistrationService(repo);

        String result = service.cancelRegistration("202308643", "EV001");

        assertEquals("Registration cancelled successfully!", result);
        assertFalse(repo.isRegistered("202308643", "EV001"));
    }

    // Test cancellation when registration does not exist
    @Test
    void testRegistrationNotFound() {
        RegistrationRepository repo = new RegistrationRepository();
        CancelRegistrationService service = new CancelRegistrationService(repo);

        String result = service.cancelRegistration("202308643", "EV999");

        assertEquals("Registration not found!", result);
    }

    // Test invalid student ID
    @Test
    void testInvalidStudentCancellation() {
        RegistrationRepository repo = new RegistrationRepository();
        CancelRegistrationService service = new CancelRegistrationService(repo);

        String result = service.cancelRegistration("ABC", "EV001");

        assertEquals("Invalid Student ID!", result);
    }

    // Test registration count after cancellation
    @Test
    void testCountAfterCancellation() {
        RegistrationRepository repo = new RegistrationRepository();
        repo.addRegistration("202308643", "EV001");
        repo.addRegistration("202300111", "EV001");

        CancelRegistrationService service = new CancelRegistrationService(repo);

        service.cancelRegistration("202308643", "EV001");

        assertEquals(1, service.getEventRegistrationCount("EV001"));
    }
}
