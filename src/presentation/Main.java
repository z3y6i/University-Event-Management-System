
package presentation;

import business.EventRegistrationService;
import model.Event;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        EventRegistrationService service =
                new EventRegistrationService();

        int choice;

        do {
            System.out.println("\n===== Event Management System =====");
            System.out.println("1. Show All Events");
            System.out.println("2. Show Event Details");
            System.out.println("3. Register for Event");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n===== Available Events =====");

                    for (Event event : service.showEvents()) {
                        System.out.println(
                                event.getEventId() + ". "
                                        + event.getName());
                    }
                    break;

                case 2:
                    System.out.print("Enter Event ID: ");
                    int detailsId = input.nextInt();

                    Event event =
                            service.showEventDetails(detailsId);

                    if (event != null) {
                        System.out.println("\n===== Event Details =====");
                        event.showDetails();
                    } else {
                        System.out.println("Event not found.");
                    }
                    break;


                case 3:
                    System.out.print("Enter Student ID: ");
                    int studentId = input.nextInt();

                    System.out.print("Enter Event ID: ");
                    int eventId = input.nextInt();

                    boolean success =
                            service.registerForEvent(studentId, eventId);

                    if (success) {
                        System.out.println("Registration Successful!");
                    } else {
                        System.out.println(
                                "Registration Failed! Already registered or invalid ID.");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        input.close();
    }
}
