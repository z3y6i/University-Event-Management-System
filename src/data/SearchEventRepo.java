package data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Data layer class that stores the list of university events.
 *
 * <p>Events are kept in memory (no database) and the repository is filled
 * with sample events when it is created, so the search feature can be used
 * straight away.</p>
 */
public class SearchEventRepo {

    private final List<Event> events = new ArrayList<>();

    /**
     * Creates the repository and fills it with sample events.
     */
    public SearchEventRepo() {
        addSampleEvents();
    }

    /**
     * Returns all stored events.
     *
     * <p>A copy of the list is returned so that callers cannot change the
     * stored events by accident.</p>
     *
     * @return a list of all events
     */
    public List<Event> getAllEvents() {
        return new ArrayList<>(events);
    }

    /**
     * Adds a new event to the repository.
     *
     * @param event the event to add
     * @throws IllegalArgumentException if the event is null
     */
    public void addEvent(Event event) {
        if (event == null) {
            throw new IllegalArgumentException("Event cannot be null");
        }
        events.add(event);
    }

    /**
     * Fills the repository with sample events for demonstration.
     */
    private void addSampleEvents() {
        events.add(new Event(1, "AI Workshop", "Technology", LocalDate.of(2026, 11, 5),
                "Building S40, Room 2051", "Hands-on introduction to artificial intelligence and machine learning.", 40));
        events.add(new Event(2, "Football Tournament", "Sports", LocalDate.of(2026, 11, 12),
                "University Stadium", "Inter-college football tournament open to all students.", 100));
        events.add(new Event(3, "Career Fair", "Career", LocalDate.of(2026, 11, 20),
                "Main Hall", "Meet companies and explore internship and job opportunities.", 300));
        events.add(new Event(4, "Cyber Security Talk", "Technology", LocalDate.of(2026, 11, 20),
                "Building S40, Auditorium", "Guest talk on protecting systems and data from cyber attacks.", 150));
        events.add(new Event(5, "Art Exhibition", "Culture", LocalDate.of(2026, 12, 3),
                "Library Gallery", "Exhibition of artwork created by university students.", 80));
        events.add(new Event(6, "Basketball Training", "Sports", LocalDate.of(2026, 12, 10),
                "Sports Center", "Weekly basketball training session for beginners.", 30));
    }
}
