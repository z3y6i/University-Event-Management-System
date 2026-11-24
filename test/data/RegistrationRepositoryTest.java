
package data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegistrationRepositoryTest {

    // Test adding a new registration
    @Test
    void testAddRegistration() {
        RegistrationRepository repository = new RegistrationRepository();

        boolean result = repository.addRegistration("202308643", "EV001");

        assertTrue(result);
        assertTrue(repository.isRegistered("202308643", "EV001"));
    }

    // Test preventing duplicate registrations
    @Test
    void testDuplicateRegistration() {
        RegistrationRepository repository = new RegistrationRepository();

        repository.addRegistration("202308643", "EV001");
        boolean result = repository.addRegistration("202308643", "EV001");

        assertFalse(result);
        assertEquals(1, repository.getTotalRegistrations());
    }

    // Test removing an existing registration
    @Test
    void testRemoveRegistration() {
        RegistrationRepository repository = new RegistrationRepository();

        repository.addRegistration("202308643", "EV001");

        boolean result = repository.removeRegistration("202308643", "EV001");

        assertTrue(result);
        assertFalse(repository.isRegistered("202308643", "EV001"));
    }

    // Test cancelling a registration that does not exist
    @Test
    void testRemoveNonExistingRegistration() {
        RegistrationRepository repository = new RegistrationRepository();

        boolean result = repository.removeRegistration("202308643", "EV999");

        assertFalse(result);
    }

    // Test counting event registrations
    @Test
    void testEventRegistrationCount() {
        RegistrationRepository repository = new RegistrationRepository();

        repository.addRegistration("202308643", "EV001");
        repository.addRegistration("202300111", "EV001");
        repository.addRegistration("202300222", "EV002");

        assertEquals(2, repository.getEventRegistrationCount("EV001"));
        assertEquals(3, repository.getTotalRegistrations());
    }
}
