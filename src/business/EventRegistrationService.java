package business;

import data.EventRegistrationDAO;
import model.Registration;

public class EventRegistrationService {

    private EventRegistrationDAO dao =
            new EventRegistrationDAO();

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

        Registration registration =
                new Registration(studentId, eventId);

        return dao.registerStudent(registration);
    }
}