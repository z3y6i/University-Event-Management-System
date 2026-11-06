
package presentation;

import business.CancelRegistrationService;
import data.RegistrationRepository;
import java.util.Scanner;

public class CancelRegistrationUI {

    public static void main(String[] args) {

        // Create the required objects
        Scanner input = new Scanner(System.in);
        RegistrationRepository repository = new RegistrationRepository();
        CancelRegistrationService service =
                new CancelRegistrationService(repository);

        // Add sample registrations
        repository.addRegistration("202308643", "EV001");
        repository.addRegistration("202300111", "EV001");

        // Display the menu
        System.out.println("=== Cancel Registration System ===");
        System.out.println("1. Cancel Registration");
        System.out.println("2. View Registrations");
        System.out.print("Enter your choice: ");

        String choice = input.nextLine();

        if (choice.equals("1")) {

            // Get student information
            System.out.print("Enter Student ID: ");
            String studentId = input.nextLine().trim();

            System.out.print("Enter Event ID: ");
            String eventId = input.nextLine().trim();

            // Validate registration
            if (!service.isValidStudentId(studentId)
                    || !service.isValidEventId(eventId)) {
                System.out.println("Invalid ID!");
            } else if (!service.checkRegistration(studentId, eventId)) {
                System.out.println("Registration not found!");
            } else {

                // Confirm cancellation
                System.out.print("Confirm cancellation (yes/no): ");
                String confirm = input.nextLine();

                if (confirm.equalsIgnoreCase("yes")) {
                    System.out.println(
                            service.cancelRegistration(studentId, eventId));
                } else {
                    System.out.println("Cancellation cancelled.");
                }
            }

        } else if (choice.equals("2")) {

            // Display all registrations
            repository.displayRegistrations();

        } else {
            System.out.println("Invalid choice!");
        }

        input.close();
    }
}
