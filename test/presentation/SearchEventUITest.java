package presentation;

import business.SearchEventService;
import data.SearchEventRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the {@link SearchEventUI} presentation layer class.
 *
 * <p>Each test gives the UI a fixed set of typed lines through a {@link Scanner}
 * and checks what it prints to the console.</p>
 */
class SearchEventUITest {

    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream output;

    @BeforeEach
    void captureOutput() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output, true));
    }

    @AfterEach
    void restoreOutput() {
        System.setOut(originalOut);
    }

    /** Runs the UI with the given lines as the student's input and returns what it printed. */
    private String runWithInput(String... lines) {
        String input = String.join("\n", lines) + "\n";
        SearchEventService service = new SearchEventService(new SearchEventRepo());
        new SearchEventUI(service, new Scanner(input)).start();
        return output.toString();
    }

    @Test
    void startShowsTitleAndMenu() {
        String out = runWithInput("0");
        assertTrue(out.contains("===== Search Events ====="));
        assertTrue(out.contains("1. Search by keyword"));
        assertTrue(out.contains("2. Search by category"));
        assertTrue(out.contains("3. Search by date"));
        assertTrue(out.contains("0. Exit"));
    }

    @Test
    void exitOptionPrintsGoodbye() {
        assertTrue(runWithInput("0").contains("Goodbye!"));
    }

    @Test
    void endOfInputStopsProgram() {
        // no "0" is typed; the UI must still stop when input runs out
        assertTrue(runWithInput("").contains("Goodbye!"));
    }

    @Test
    void invalidChoiceShowsErrorMessage() {
        assertTrue(runWithInput("9", "0").contains("Invalid choice, please enter 0-3."));
    }

    @Test
    void keywordSearchShowsMatchingEvent() {
        String out = runWithInput("1", "workshop", "0");
        assertTrue(out.contains("1 event(s) found:"));
        assertTrue(out.contains("AI Workshop"));
    }

    @Test
    void keywordSearchWithNoMatchShowsNoEventsFound() {
        assertTrue(runWithInput("1", "chess", "0").contains("No events found."));
    }

    @Test
    void emptyKeywordShowsErrorMessage() {
        assertTrue(runWithInput("1", "", "0").contains("Error: Keyword cannot be empty"));
    }

    @Test
    void categorySearchShowsAllEventsInCategory() {
        String out = runWithInput("2", "sports", "0");
        assertTrue(out.contains("2 event(s) found:"));
        assertTrue(out.contains("Football Tournament"));
        assertTrue(out.contains("Basketball Training"));
    }

    @Test
    void emptyCategoryShowsErrorMessage() {
        assertTrue(runWithInput("2", "  ", "0").contains("Error: Category cannot be empty"));
    }

    @Test
    void dateSearchShowsEventsOnThatDay() {
        String out = runWithInput("3", "2026-11-20", "0");
        assertTrue(out.contains("2 event(s) found:"));
        assertTrue(out.contains("Career Fair"));
        assertTrue(out.contains("Cyber Security Talk"));
    }

    @Test
    void dateSearchWithNoEventsShowsNoEventsFound() {
        assertTrue(runWithInput("3", "2026-01-01", "0").contains("No events found."));
    }

    @Test
    void invalidDateFormatShowsErrorMessage() {
        String out = runWithInput("3", "20/11/2026", "0");
        assertTrue(out.contains("Error: Invalid date format, please use yyyy-MM-dd."));
    }

    @Test
    void severalSearchesCanBeDoneBeforeExit() {
        String out = runWithInput("1", "workshop", "2", "Culture", "0");
        assertTrue(out.contains("AI Workshop"));
        assertTrue(out.contains("Art Exhibition"));
        assertTrue(out.contains("Goodbye!"));
    }
}
