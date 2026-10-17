package business;

import data.RegistrationRepository;

public class CancelRegistrationService {

    private RegistrationRepository repository;

    public CancelRegistrationService(RegistrationRepository repository) {
        this.repository = repository;
    }

    public String cancelRegistration(String studentId, String eventId) {

        if (studentId == null || studentId.isBlank()
                || eventId == null || eventId.isBlank()) {
            return "Student ID and Event ID are required.";
        }

        if (!repository.isRegistered(studentId, eventId)) {
            return "Registration not found!";
        }

        repository.removeRegistration(studentId, eventId);

        return "Registration cancelled successfully!";
    }
}
