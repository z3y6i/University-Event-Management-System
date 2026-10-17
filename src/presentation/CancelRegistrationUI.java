package presentation;

import business.CancelRegistrationService;
import data.RegistrationRepository;

import java.util.Scanner;

public class CancelRegistrationUI {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        RegistrationRepository repository =
                new RegistrationRepository();

        CancelRegistrationService service =
                new CancelRegistrationService(repository);

        repository.addRegistration("202308643", "EV001");

        System.out.println("=== Cancel Registration ===");

        System.out.print("Enter Student ID: ");
        String studentId = input.nextLine();

        System.out.print("Enter Event ID: ");
        String eventId = input.nextLine();

        String result = service.cancelRegistration(studentId, eventId);

        System.out.println(result);

        input.close();
    }
}
