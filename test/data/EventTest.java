package data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the {@link Event} data class.
 */
class EventTest {

    private Event event;

    @BeforeEach
    void setUp() {
        event = new Event(7, "Robotics Club", "Technology", LocalDate.of(2026, 11, 15),
                "Building S40, Lab 1", "Build and program small robots.", 25);
    }

    @Test
    void constructorStoresId() {
        assertEquals(7, event.getId());
    }

    @Test
    void constructorStoresName() {
        assertEquals("Robotics Club", event.getName());
    }

    @Test
    void constructorStoresCategory() {
        assertEquals("Technology", event.getCategory());
    }

    @Test
    void constructorStoresDate() {
        assertEquals(LocalDate.of(2026, 11, 15), event.getDate());
    }

    @Test
    void constructorStoresLocation() {
        assertEquals("Building S40, Lab 1", event.getLocation());
    }

    @Test
    void constructorStoresDescription() {
        assertEquals("Build and program small robots.", event.getDescription());
    }

    @Test
    void constructorStoresCapacity() {
        assertEquals(25, event.getCapacity());
    }

    @Test
    void toStringShowsAllEventDetails() {
        String expected = "[7] Robotics Club | Technology | 2026-11-15"
                + " | Building S40, Lab 1 | Capacity: 25"
                + "\n     Build and program small robots.";
        assertEquals(expected, event.toString());
    }
}
