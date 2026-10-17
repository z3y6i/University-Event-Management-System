package data;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository responsible for storing events.
 */
public class CreateEventRepo {

    private List<String> events = new ArrayList<>();

    /**
     * Saves event information.
     *
     * @param event event details
     */
    public void saveEvent(String event) {
        events.add(event);
    }

    /**
     * Returns all stored events.
     *
     * @return list of events
     */
    public List<String> getEvents() {
        return events;
    }
}