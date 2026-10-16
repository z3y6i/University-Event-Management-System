package model;

public class Event {

    private int eventId;
    private String eventName;
    private String location;

    public Event(int eventId, String eventName, String location) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getLocation() {
        return location;
    }
}