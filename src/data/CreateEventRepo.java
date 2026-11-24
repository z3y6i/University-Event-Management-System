package data;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository responsible for storing events.
 */
public class CreateEventRepo {

    // List used to store event information
    private List<String> events = new ArrayList<>();

    /**
     * Saves event information.
     *
     * @param event event details
     */
    public void saveEvent(String event) {

        // Add new event to the list
        events.add(event);
    }

    /**
     * Returns all stored events.
     *
     * @return list of events
     */
    public List<String> getEvents() {

        // Return all saved events
        return events;
    }
}