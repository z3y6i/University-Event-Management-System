package business;

import model.Event;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EventRegistrationServiceTest {

    EventRegistrationService service =
            new EventRegistrationService();

    @Test
    void testShowEventDetails() {

        Event event = service.showEventDetails(1);

        assertNotNull(event);
        assertEquals("AI Workshop", event.getName());
    }

    @Test
    void testInvalidEventId() {

        Event event = service.showEventDetails(-1);

        assertNull(event);
    }

    @Test
    void testRegisterForEvent() {

        boolean result =
                service.registerForEvent(100, 1);

        assertTrue(result);
    }
}