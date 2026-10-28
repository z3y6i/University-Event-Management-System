package data;

import model.Event;
import model.Registration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EventRegistrationDAOTest {

    EventRegistrationDAO dao =
            new EventRegistrationDAO();

    @Test
    void testGetEventById() {

        Event event = dao.getEventById(1);

        assertNotNull(event);
        assertEquals("AI Workshop",
                event.getName());
    }

    @Test
    void testRegisterStudent() {

        Registration registration =
                new Registration(1, 1);

        assertTrue(
                dao.registerStudent(registration)
        );
    }
}