package business;

import data.Event;
import data.SearchEventRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the {@link SearchEventService} business layer class.
 * The tests use the sample events that {@link SearchEventRepo} is created with.
 */
class SearchEventServiceTest {

    private SearchEventService service;

    @BeforeEach
    void setUp() {
        service = new SearchEventService(new SearchEventRepo());
    }

    /** Returns the ids of the given events, to make assertions short. */
    private List<Integer> ids(List<Event> events) {
        return events.stream().map(Event::getId).toList();
    }

    // ----- constructor -----

    @Test
    void constructorWithNullRepoThrowsException() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> new SearchEventService(null));
        assertEquals("Repository cannot be null", e.getMessage());
    }

    // ----- searchByKeyword -----

    @Test
    void searchByKeywordMatchesName() {
        assertEquals(List.of(1), ids(service.searchByKeyword("Workshop")));
    }

    @Test
    void searchByKeywordMatchesDescription() {
        // "internship" only appears in the Career Fair description
        assertEquals(List.of(3), ids(service.searchByKeyword("internship")));
    }

    @Test
    void searchByKeywordIgnoresCase() {
        assertEquals(List.of(1), ids(service.searchByKeyword("aI wOrKsHoP")));
    }

    @Test
    void searchByKeywordIgnoresSurroundingSpaces() {
        assertEquals(List.of(1), ids(service.searchByKeyword("   workshop   ")));
    }

    @Test
    void searchByKeywordReturnsAllMatches() {
        // "ball" is in "Football Tournament" and "Basketball Training"
        assertEquals(List.of(2, 6), ids(service.searchByKeyword("ball")));
    }

    @Test
    void searchByKeywordWithNoMatchReturnsEmptyList() {
        assertTrue(service.searchByKeyword("chess").isEmpty());
    }

    @Test
    void searchByNullKeywordThrowsException() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> service.searchByKeyword(null));
        assertEquals("Keyword cannot be empty", e.getMessage());
    }

    @Test
    void searchByEmptyKeywordThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> service.searchByKeyword(""));
    }

    @Test
    void searchByBlankKeywordThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> service.searchByKeyword("   "));
    }

    // ----- searchByCategory -----

    @Test
    void searchByCategoryReturnsAllEventsInCategory() {
        assertEquals(List.of(1, 4), ids(service.searchByCategory("Technology")));
    }

    @Test
    void searchByCategoryIgnoresCase() {
        assertEquals(List.of(2, 6), ids(service.searchByCategory("sPoRtS")));
    }

    @Test
    void searchByCategoryIgnoresSurroundingSpaces() {
        assertEquals(List.of(5), ids(service.searchByCategory("  Culture  ")));
    }

    @Test
    void searchByCategoryRequiresExactMatch() {
        // part of a category name should not match
        assertTrue(service.searchByCategory("Tech").isEmpty());
    }

    @Test
    void searchByUnknownCategoryReturnsEmptyList() {
        assertTrue(service.searchByCategory("Music").isEmpty());
    }

    @Test
    void searchByNullCategoryThrowsException() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> service.searchByCategory(null));
        assertEquals("Category cannot be empty", e.getMessage());
    }

    @Test
    void searchByBlankCategoryThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> service.searchByCategory("   "));
    }

    // ----- searchByDate -----

    @Test
    void searchByDateReturnsSingleEvent() {
        assertEquals(List.of(1), ids(service.searchByDate(LocalDate.of(2026, 11, 5))));
    }

    @Test
    void searchByDateReturnsAllEventsOnThatDay() {
        assertEquals(List.of(3, 4), ids(service.searchByDate(LocalDate.of(2026, 11, 20))));
    }

    @Test
    void searchByDateWithNoEventsReturnsEmptyList() {
        assertTrue(service.searchByDate(LocalDate.of(2026, 1, 1)).isEmpty());
    }

    @Test
    void searchByNullDateThrowsException() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> service.searchByDate(null));
        assertEquals("Date cannot be empty", e.getMessage());
    }

    // ----- events added later -----

    @Test
    void searchFindsEventAddedToRepo() {
        SearchEventRepo repo = new SearchEventRepo();
        repo.addEvent(new Event(7, "Robotics Club", "Technology", LocalDate.of(2026, 11, 15),
                "Lab 1", "Build robots.", 25));
        SearchEventService serviceWithNewEvent = new SearchEventService(repo);

        assertEquals(List.of(7), ids(serviceWithNewEvent.searchByKeyword("robot")));
        assertEquals(List.of(1, 4, 7), ids(serviceWithNewEvent.searchByCategory("Technology")));
        assertEquals(List.of(7), ids(serviceWithNewEvent.searchByDate(LocalDate.of(2026, 11, 15))));
    }
}
