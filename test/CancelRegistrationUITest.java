
import org.junit.jupiter.api.Test;
import presentation.CancelRegistrationUI;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class CancelRegistrationUITest {

    @Test
    public void testSuccessfulCancellation() {
        InputStream originalInput = System.in;
        PrintStream originalOutput = System.out;

        try {
            String input = "202308643\nEV001\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));

            ByteArrayOutputStream output = new ByteArrayOutputStream();
            System.setOut(new PrintStream(output));

            CancelRegistrationUI.main(new String[]{});

            assertTrue(output.toString().contains(
                    "Registration cancelled successfully!"));

        } finally {
            System.setIn(originalInput);
            System.setOut(originalOutput);
        }
    }
}
