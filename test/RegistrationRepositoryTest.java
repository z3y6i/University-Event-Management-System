
import data.RegistrationRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegistrationRepositoryTest {

    @Test
    public void testAddRegistration() {
        RegistrationRepository repo = new RegistrationRepository();

        repo.addRegistration("S001", "E001");

        assertTrue(repo.isRegistered("S001", "E001"));
    }

    @Test
    public void testCancelRegistration() {
        RegistrationRepository repo = new RegistrationRepository();

        repo.addRegistration("S001", "E001");
        boolean result = repo.removeRegistration("S001", "E001");

        assertTrue(result);
        assertFalse(repo.isRegistered("S001", "E001"));
    }

    @Test
    public void testInvalidCancellation() {
        RegistrationRepository repo = new RegistrationRepository();

        boolean result = repo.removeRegistration("S001", "E001");

        assertFalse(result);
    }
}
