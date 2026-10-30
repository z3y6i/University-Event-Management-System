package business;

import data.RegistrationRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CancelRegistrationServiceTest {

    @Test
    public void testCancelRegistration() {
        RegistrationRepository repo = new RegistrationRepository();
        repo.addRegistration("S001", "E001");

        CancelRegistrationService service = new CancelRegistrationService(repo);

        String result = service.cancelRegistration("S001", "E001");

        assertEquals("Registration cancelled successfully!", result);
        assertFalse(repo.isRegistered("S001", "E001"));
    }

    @Test
    public void testRegistrationNotFound() {
        RegistrationRepository repo = new RegistrationRepository();
        CancelRegistrationService service = new CancelRegistrationService(repo);

        String result = service.cancelRegistration("S001", "E001");

        assertEquals("Registration not found!", result);
    }

    @Test
    public void testEmptyStudentId() {
        RegistrationRepository repo = new RegistrationRepository();
        CancelRegistrationService service = new CancelRegistrationService(repo);

        String result = service.cancelRegistration("", "E001");

        assertEquals("Student ID and Event ID are required.", result);
    }

    @Test
    public void testEmptyEventId() {
        RegistrationRepository repo = new RegistrationRepository();
        CancelRegistrationService service = new CancelRegistrationService(repo);

        String result = service.cancelRegistration("S001", "");

        assertEquals("Student ID and Event ID are required.", result);
    }
}
