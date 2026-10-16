package business;

import data.EventRegistrationDAO;
import model.Registration;

import model.Event;


public class EventRegistrationService {

    private EventRegistrationDAO dao =
            new EventRegistrationDAO();

    public Event getEventDetails(int eventId) {
        return dao.getEventDetails(eventId);
    }


    public boolean registerForEvent(int studentId,
                                    int eventId) {

        if (studentId <= 0) {
            System.out.println("Invalid Student ID");
            return false;
        }

        if (eventId <= 0) {
            System.out.println("Invalid Event ID");
            return false;
        }

        if (!dao.eventExists(eventId)) {
            System.out.println("Event does not exist.");
            return false;
        }

        Registration registration =
                new Registration(studentId, eventId);

        return dao.registerStudent(registration);
    }
}