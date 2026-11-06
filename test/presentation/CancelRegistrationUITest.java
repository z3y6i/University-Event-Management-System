
package presentation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class CancelRegistrationUITest {

    // Runs the UI with sample input and captures its output
    private String runProgram(String userInput) {
        InputStream oldInput = System.in;
        PrintStream oldOutput = System.out;

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            System.setIn(new ByteArrayInputStream(
                    userInput.getBytes(StandardCharsets.UTF_8)));
            System.setOut(new PrintStream(output, true,
                    StandardCharsets.UTF_8));

            CancelRegistrationUI.main(new String[0]);

            return output.toString(StandardCharsets.UTF_8);
        } finally {
            System.setIn(oldInput);
            System.setOut(oldOutput);
        }
    }

    // Tests successful cancellation from the UI
    @Test
    void testSuccessfulCancellation() {
        String output = runProgram("1\n202308643\nEV001\nyes\n");

        assertTrue(output.contains(
                "Registration cancelled successfully!"));
    }

    // Tests cancellation without confirmation
    @Test
    void testCancellationNotConfirmed() {
        String output = runProgram("1\n202308643\nEV001\nno\n");

        assertTrue(output.contains("Cancellation cancelled."));
    }

    // Tests an invalid student ID
    @Test
    void testInvalidStudentId() {
        String output = runProgram("1\nABC\nEV001\n");

        assertTrue(output.contains("Invalid ID!"));
    }

    // Tests a registration that does not exist
    @Test
    void testRegistrationNotFound() {
        String output = runProgram("1\n202308643\nEV999\n");

        assertTrue(output.contains("Registration not found!"));
    }

    // Tests viewing the stored registrations
    @Test
    void testViewRegistrations() {
        String output = runProgram("2\n");

        assertTrue(output.contains("202308643:EV001"));
    }

    // Tests an invalid menu choice
    @Test
    void testInvalidMenuChoice() {
        String output = runProgram("9\n");

        assertTrue(output.contains("Invalid choice!"));
    }
}
