package business;

import data.CreateEventRepo;
import java.time.LocalDate;

/**
 * Contains business logic for creating events.
 */
public class CreateEventService {

    private CreateEventRepo repo;

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

        if (title == null || title.trim().isEmpty()) {
            return false;
        }

        if (description == null || description.trim().isEmpty()) {
            return false;
        }

        if (location == null || location.trim().isEmpty()) {
            return false;
        }

        if (eventDate == null) {
            return false;
        }

        if (capacity <= 0) {
            return false;
        }

        String eventInfo =
                "Title: " + title +
                        ", Description: " + description +
                        ", Location: " + location +
                        ", Date: " + eventDate +
                        ", Capacity: " + capacity;

        repo.saveEvent(eventInfo);

        return true;
    }
}