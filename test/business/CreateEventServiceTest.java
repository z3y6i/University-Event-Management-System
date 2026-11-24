package business;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class CreateEventServiceTest {

    @Test
    public void createEventSuccessfully() {

        CreateEventService service = new CreateEventService();

        boolean result = service.createEvent(
                "Workshop",
                "Java Basics",
                "Lab 1",
                LocalDate.of(2026, 5, 5),
                30
        );

        assertTrue(result);
    }

    @Test
    public void createEventWithInvalidCapacity() {

        CreateEventService service = new CreateEventService();

        boolean result = service.createEvent(
                "Workshop",
                "Java Basics",
                "Lab 1",
                LocalDate.of(2026, 5, 5),
                0
        );

        assertFalse(result);
    }
}