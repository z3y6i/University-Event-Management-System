package presentation;

import business.EventRegistrationService;
import java.util.Scanner;
import model.Event;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        EventRegistrationService service = new EventRegistrationService();

        System.out.println("===== Register For Event =====");
        System.out.println("Available Event IDs: 1, 2, 3");

        System.out.print("Enter Student ID: ");
        int studentId = input.nextInt();

        System.out.print("Enter Event ID: ");
        int eventId = input.nextInt();

        Event event = service.getEventDetails(eventId);

        if (event == null) {
            System.out.println("Event not found!");
            return;
        }
        System.out.println("\n===== Event Details =====");
        System.out.println("Event ID: " + event.getEventId());
        System.out.println("Event Name: " + event.getEventName());

        boolean success = service.registerForEvent(studentId, eventId);

        if (success) {
            System.out.println(
                    "Registration completed successfully."
            );
        } else {
            System.out.println(
                    "Registration request could not be processed."
            );
        }

        input.close();
    }
}