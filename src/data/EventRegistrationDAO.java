
package data;

import java.util.ArrayList;
import java.util.List;
import model.Event;
import model.Registration;

public class EventRegistrationDAO {

    private List<Event> events = new ArrayList<>();
    private List<Registration> registrations = new ArrayList<>();

    public EventRegistrationDAO() {

        events.add(new Event(1, "AI Workshop",
                "20/10/2026", "Lab 101"));

        events.add(new Event(2, "Web Development",
                "22/10/2026", "Lab 202"));

        events.add(new Event(3, "Cybersecurity Seminar",
                "25/10/2026", "Hall A"));
    }

    public List<Event> getAllEvents() {
        return events;
    }

    public Event getEventById(int eventId) {

        for (Event event : events) {
            if (event.getEventId() == eventId) {
                return event;
            }
        }

        return null;
    }

    public boolean isAlreadyRegistered(
            int studentId, int eventId) {

        for (Registration registration : registrations) {

            if (registration.getStudentId() == studentId
                    && registration.getEventId() == eventId) {
                return true;
            }
        }

        return false;
    }


    public boolean registerStudent(Registration registration) {

        // Check if this student already registered for this event
        for (Registration r : registrations) {

            if (r.getStudentId() == registration.getStudentId()
                    && r.getEventId() == registration.getEventId()) {

                System.out.println(
                        "Registration failed! You are already registered for this event.");

                return false;
            }
        }

        // Register the student if no duplicate exists
        registrations.add(registration);

        System.out.println("Registration successful!");
        return true;
    }

}
