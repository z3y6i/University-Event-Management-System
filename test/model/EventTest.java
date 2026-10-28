package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EventTest {

    @Test
    void testEventConstructor() {

        Event event =
                new Event(1,
                        "AI Workshop",
                        "20/10/2026",
                        "Lab 101");

        assertEquals(1,
                event.getEventId());

        assertEquals("AI Workshop",
                event.getName());

        assertEquals("20/10/2026",
                event.getDate());

        assertEquals("Lab 101",
                event.getLocation());
    }
}
