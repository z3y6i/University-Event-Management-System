
package data;

import java.util.HashSet;
import java.util.Set;

public class RegistrationRepository {

    // Stores all student event registrations
    private Set<String> registrations = new HashSet<>();

    // Creates a unique key for each registration
    private String createKey(String studentId, String eventId) {
        return studentId + ":" + eventId;
    }

    // Adds a new registration
    public boolean addRegistration(String studentId, String eventId) {

        if (studentId == null || studentId.isBlank()
                || eventId == null || eventId.isBlank()) {
            return false;
        }

        return registrations.add(createKey(studentId, eventId));
    }

    // Checks if a registration exists
    public boolean isRegistered(String studentId, String eventId) {

        return registrations.contains(createKey(studentId, eventId));
    }

    // Removes an existing registration
    public boolean removeRegistration(String studentId, String eventId) {

        return registrations.remove(createKey(studentId, eventId));
    }

    // Counts all registrations
    public int getTotalRegistrations() {

        return registrations.size();
    }

    // Counts registrations for a specific event
    public int getEventRegistrationCount(String eventId) {

        int count = 0;

        for (String registration : registrations) {

            if (registration.endsWith(":" + eventId)) {
                count++;
            }
        }

        return count;
    }

    // Displays all stored registrations
    public void displayRegistrations() {

        if (registrations.isEmpty()) {
            System.out.println("No registrations available.");
            return;
        }

        for (String registration : registrations) {
            System.out.println(registration);
        }
    }
}
