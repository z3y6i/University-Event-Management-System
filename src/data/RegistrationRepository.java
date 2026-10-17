package data;

import java.util.HashSet;
import java.util.Set;

public class RegistrationRepository {

    private Set<String> registrations = new HashSet<>();

    public void addRegistration(String studentId, String eventId) {
        registrations.add(studentId + ":" + eventId);
    }

    public boolean isRegistered(String studentId, String eventId) {
        return registrations.contains(studentId + ":" + eventId);
    }

    public boolean removeRegistration(String studentId, String eventId) {
        return registrations.remove(studentId + ":" + eventId);
    }
}
