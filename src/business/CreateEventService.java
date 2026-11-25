//hi
package business;

import data.CreateEventRepo;
import java.time.LocalDate;

/**
 * Contains business logic for creating events.
 */
public class CreateEventService {

    // Reference to the data layer
    private CreateEventRepo repo;

    /**
     * Constructor initializes the repository object.
     */
    public CreateEventService() {
        repo = new CreateEventRepo();
    }

    /**
     * Creates a new event after validation.
     *
     * @param title Event title
     * @param description Event description
     * @param location Event location
     * @param eventDate Event date
     * @param capacity Maximum attendees
     * @return true if event is created successfully
     */
    public boolean createEvent(String title,
                               String description,
                               String location,
                               LocalDate eventDate,
                               int capacity) {

        // Validate title
        if (title == null || title.trim().isEmpty()) {
            return false;
        }

        // Validate description
        if (description == null || description.trim().isEmpty()) {
            return false;
        }

        // Validate location
        if (location == null || location.trim().isEmpty()) {
            return false;
        }

        // Validate date
        if (eventDate == null) {
            return false;
        }

        // Validate capacity
        if (capacity <= 0) {
            return false;
        }

        // Create event information string
        String eventInfo =
                "Title: " + title +
                        ", Description: " + description +
                        ", Location: " + location +
                        ", Date: " + eventDate +
                        ", Capacity: " + capacity;

        // Save event using repository
        repo.saveEvent(eventInfo);

        return true;
    }
}
