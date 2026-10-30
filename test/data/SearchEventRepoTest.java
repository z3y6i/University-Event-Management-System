package data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the {@link SearchEventRepo} data layer class.
 */
class SearchEventRepoTest {

    private SearchEventRepo repo;

    @BeforeEach
    void setUp() {
        repo = new SearchEventRepo();
    }

    @Test
    void newRepoContainsSixSampleEvents() {
        assertEquals(6, repo.getAllEvents().size());
    }

    @Test
    void sampleEventsAreInExpectedOrder() {
        List<Event> events = repo.getAllEvents();
        assertEquals("AI Workshop", events.get(0).getName());
        assertEquals("Basketball Training", events.get(5).getName());
    }

    @Test
    void addEventIncreasesNumberOfEvents() {
        Event event = new Event(7, "Robotics Club", "Technology", LocalDate.of(2026, 11, 15),
                "Lab 1", "Build robots.", 25);

        repo.addEvent(event);

        List<Event> events = repo.getAllEvents();
        assertEquals(7, events.size());
        assertSame(event, events.get(6));
    }

    @Test
    void addNullEventThrowsException() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> repo.addEvent(null));
        assertEquals("Event cannot be null", e.getMessage());
    }

    @Test
    void addNullEventDoesNotChangeEvents() {
        assertThrows(IllegalArgumentException.class, () -> repo.addEvent(null));
        assertEquals(6, repo.getAllEvents().size());
    }

    @Test
    void changingReturnedListDoesNotChangeRepo() {
        List<Event> events = repo.getAllEvents();
        events.clear();

        assertEquals(6, repo.getAllEvents().size());
    }
}
