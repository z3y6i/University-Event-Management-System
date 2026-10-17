package presentation;

import business.CreateEventService;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * User interface for creating a new event.
 */
public class CreateEventUI {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CreateEventService service = new CreateEventService();

        System.out.println("===== Create Event =====");

        System.out.print("Enter Event Title: ");
        String title = input.nextLine();

        System.out.print("Enter Event Description: ");
        String description = input.nextLine();

        System.out.print("Enter Event Location: ");
        String location = input.nextLine();

        System.out.print("Enter Event Date (YYYY-MM-DD): ");
        LocalDate eventDate = LocalDate.parse(input.nextLine());

        System.out.print("Enter Event Capacity: ");
        int capacity = input.nextInt();

        boolean success = service.createEvent(
                title,
                description,
                location,
                eventDate,
                capacity
        );

        if (success) {
            System.out.println("Event created successfully.");
        } else {
            System.out.println("Invalid event information.");
        }

        input.close();
    }
}