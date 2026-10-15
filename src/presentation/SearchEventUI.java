package presentation;

import business.SearchEventService;
import data.Event;
import data.SearchEventRepo;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

/**
 * Presentation layer class that lets a student search for events from the console.
 *
 * <p>It shows a menu, reads the student's input, passes it to the business
 * layer, and prints the results. It contains no search logic itself.</p>
 */
public class SearchEventUI {

    private final SearchEventService service;
    private final Scanner scanner;

    /**
     * Creates the user interface.
     *
     * @param service the business service used to search events
     * @param scanner the scanner used to read the student's input
     */
    public SearchEventUI(SearchEventService service, Scanner scanner) {
        this.service = service;
        this.scanner = scanner;
    }

    /**
     * Shows the search menu repeatedly until the student chooses to exit.
     */
    public void start() {
        System.out.println("===== Search Events =====");
        boolean running = true;
        while (running) {
            showMenu();
            if (!scanner.hasNextLine()) {
                break; // no more input (e.g. input stream closed)
            }
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1" -> searchByKeyword();
                case "2" -> searchByCategory();
                case "3" -> searchByDate();
                case "0" -> running = false;
                default -> System.out.println("Invalid choice, please enter 0-3.");
            }
        }
        System.out.println("Goodbye!");
    }

    /**
     * Prints the menu options.
     */
    private void showMenu() {
        System.out.println();
        System.out.println("1. Search by keyword");
        System.out.println("2. Search by category");
        System.out.println("3. Search by date");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    /**
     * Asks the student for a keyword and shows the matching events.
     */
    private void searchByKeyword() {
        System.out.print("Enter keyword: ");
        String keyword = scanner.nextLine();
        try {
            showResults(service.searchByKeyword(keyword));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Asks the student for a category and shows the matching events.
     */
    private void searchByCategory() {
        System.out.print("Enter category (e.g. Technology, Sports, Career, Culture): ");
        String category = scanner.nextLine();
        try {
            showResults(service.searchByCategory(category));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Asks the student for a date and shows the events on that day.
     */
    private void searchByDate() {
        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = scanner.nextLine().trim();
        try {
            LocalDate date = LocalDate.parse(input);
            showResults(service.searchByDate(date));
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid date format, please use yyyy-MM-dd.");
        }
    }

    /**
     * Prints the list of events found, or a message if the list is empty.
     *
     * @param events the events to display
     */
    private void showResults(List<Event> events) {
        if (events.isEmpty()) {
            System.out.println("No events found.");
            return;
        }
        System.out.println(events.size() + " event(s) found:");
        for (Event event : events) {
            System.out.println("  " + event);
        }
    }

    /**
     * Starts the Search Event program.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        SearchEventRepo repo = new SearchEventRepo();
        SearchEventService service = new SearchEventService(repo);
        SearchEventUI ui = new SearchEventUI(service, new Scanner(System.in));
        ui.start();
    }
}
