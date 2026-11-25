//hello
package business;

import data.RegistrationRepository;

public class CancelRegistrationService {

    // Connects the business layer with the data layer
    private RegistrationRepository repository;

    // Constructor receives the registration repository
    public CancelRegistrationService(RegistrationRepository repository) {
        this.repository = repository;
    }

    // Checks if the student ID is valid
    public boolean isValidStudentId(String studentId) {

        if (studentId == null || studentId.isBlank()) {
            return false;
        }

        return studentId.matches("[0-9]+");
    }

    // Checks if the event ID is valid
    public boolean isValidEventId(String eventId) {

        if (eventId == null || eventId.isBlank()) {
            return false;
        }

        return eventId.matches("EV[0-9]+");
    }

    // Checks if the student has an existing registration
    public boolean checkRegistration(String studentId, String eventId) {

        return repository.isRegistered(studentId, eventId);
    }

    // Cancels the registration after checking the input
    public String cancelRegistration(String studentId, String eventId) {

        if (!isValidStudentId(studentId)) {
            return "Invalid Student ID!";
        }

        if (!isValidEventId(eventId)) {
            return "Invalid Event ID!";
        }

        if (!checkRegistration(studentId, eventId)) {
            return "Registration not found!";
        }

        boolean cancelled = repository.removeRegistration(studentId, eventId);

        if (cancelled) {
            return "Registration cancelled successfully!";
        }

        return "Cancellation failed!";
    }

    // Returns the number of students registered for an event
    public int getEventRegistrationCount(String eventId) {

        return repository.getEventRegistrationCount(eventId);
    }

    // Returns the total number of registrations
    public int getTotalRegistrations() {

        return repository.getTotalRegistrations();
    }
}
