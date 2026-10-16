package business;
import data.EventRegistrationDAO;
import model.Event;
import model.Registration;
import java.util.List;


public class EventRegistrationService {

    private EventRegistrationDAO dao =
            new EventRegistrationDAO();

    public List<Event> showEvents() {
        return dao.getAllEvents();
    }

    public Event showEventDetails(int eventId) {

        if (eventId <= 0) {
            return null;
        }

        return dao.getEventById(eventId);
    }

    public boolean registerForEvent(int studentId,
                                    int eventId) {

        if (studentId <= 0 || eventId <= 0) {
            return false;
        }

        // Check that the event exists
        Event event = dao.getEventById(eventId);

        if (event == null) {
            return false;
        }

        // Check for duplicate registration
        if (dao.isAlreadyRegistered(studentId, eventId)) {
            System.out.println(
                    "You are already registered for this event.");
            return false;
        }

        Registration registration =
                new Registration(studentId, eventId);

        return dao.registerStudent(registration);
    }
}