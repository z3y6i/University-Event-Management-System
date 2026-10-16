
package model;

public class Event {

    private int eventId;
    private String name;
    private String date;
    private String location;

    public Event(int eventId, String name,
                 String date, String location) {
        this.eventId = eventId;
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public int getEventId() {
        return eventId;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public void showDetails() {
        System.out.println("Event ID: " + eventId);
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }
}
