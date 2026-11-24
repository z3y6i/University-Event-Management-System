package presentation;

import business.CreateEventService;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * User interface for creating a new event.
 * Collects event information from the user and sends it to the service layer.
 */
public class CreateEventUI {

    public static void main(String[] args) {

        // Scanner object used to read user input
        Scanner input = new Scanner(System.in);

        // Create instance of service layer
        CreateEventService service = new CreateEventService();

        System.out.println("===== Create Event =====");

        // Get event title from the user
        System.out.print("Enter Event Title: ");
        String title = input.nextLine();

        // Get event description from the user
        System.out.print("Enter Event Description: ");
        String description = input.nextLine();

        // Get event location from the user
        System.out.print("Enter Event Location: ");
        String location = input.nextLine();

        // Get event date from the user
        System.out.print("Enter Event Date (YYYY-MM-DD): ");
        LocalDate eventDate = LocalDate.parse(input.nextLine());

        // Get event capacity from the user
        System.out.print("Enter Event Capacity: ");
        int capacity = input.nextInt();

        // Call service layer to create the event
        boolean success = service.createEvent(
                title,
                description,
                location,
                eventDate,
                capacity
        );

        // Display result to the user
        if (success) {
            System.out.println("Event created successfully.");
        } else {
            System.out.println("Invalid event information.");
        }

        // Close scanner
        input.close();
    }
}