package presentation;

import business.EventRegistrationService;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        EventRegistrationService service = new EventRegistrationService();

        System.out.println("===== Register For Event =====");

        System.out.print("Enter Student ID: ");
        int studentId = input.nextInt();

        System.out.print("Enter Event ID: ");
        int eventId = input.nextInt();

        boolean success = service.registerForEvent(studentId, eventId);

        if (success) {
            System.out.println("Registration Successful!");
        } else {
            System.out.println("Registration Failed!");
        }

        input.close();
    }
}