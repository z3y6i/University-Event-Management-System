package data;

import java.time.LocalDate;

/**
 * Represents a university event.
 *
 * <p>This is a simple data class that only stores the details of an event.
 * It belongs to the data layer and contains no business logic.</p>
 */
public class Event {

    private final int id;
    private final String name;
    private final String category;
    private final LocalDate date;
    private final String location;
    private final String description;
    private final int capacity;

    /**
     * Creates a new event with all of its details.
     *
     * @param id          unique number that identifies the event
     * @param name        name of the event, e.g. "AI Workshop"
     * @param category    category of the event, e.g. "Technology" or "Sports"
     * @param date        the day the event takes place
     * @param location    where the event takes place
     * @param description short description of the event
     * @param capacity    maximum number of participants
     */
    public Event(int id, String name, String category, LocalDate date,
                 String location, String description, int capacity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.date = date;
        this.location = location;
        this.description = description;
        this.capacity = capacity;
    }

    /**
     * Returns the unique id of the event.
     *
     * @return the event id
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the name of the event.
     *
     * @return the event name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the category of the event.
     *
     * @return the event category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Returns the date of the event.
     *
     * @return the event date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Returns the location of the event.
     *
     * @return the event location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Returns the description of the event.
     *
     * @return the event description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the maximum number of participants.
     *
     * @return the event capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Returns a readable one-line summary of the event, used when displaying search results.
     *
     * @return the event details as text
     */
    @Override
    public String toString() {
        return "[" + id + "] " + name + " | " + category + " | " + date
                + " | " + location + " | Capacity: " + capacity
                + "\n     " + description;
    }
}
