package business;

import data.Event;
import data.SearchEventRepo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Business layer class that contains the logic for searching events.
 *
 * <p>Students can search events by keyword, category, or date. This class
 * gets the events from the data layer and returns only the ones that match.</p>
 */
public class SearchEventService {

    private final SearchEventRepo repo;

    /**
     * Creates the service using the given repository as the source of events.
     *
     * @param repo the repository that stores the events
     * @throws IllegalArgumentException if the repository is null
     */
    public SearchEventService(SearchEventRepo repo) {
        if (repo == null) {
            throw new IllegalArgumentException("Repository cannot be null");
        }
        this.repo = repo;
    }

    /**
     * Finds events whose name or description contains the keyword.
     * The search ignores upper and lower case.
     *
     * @param keyword the word to search for, e.g. "workshop"
     * @return the matching events, or an empty list if none match
     * @throws IllegalArgumentException if the keyword is null or blank
     */
    public List<Event> searchByKeyword(String keyword) {
        if (keyword == null || keyword.isBlank()) {
            throw new IllegalArgumentException("Keyword cannot be empty");
        }
        String text = keyword.trim().toLowerCase();
        List<Event> results = new ArrayList<>();
        for (Event event : repo.getAllEvents()) {
            if (event.getName().toLowerCase().contains(text)
                    || event.getDescription().toLowerCase().contains(text)) {
                results.add(event);
            }
        }
        return results;
    }

    /**
     * Finds events that belong to the given category.
     * The category must match exactly, ignoring upper and lower case.
     *
     * @param category the category to search for, e.g. "Sports"
     * @return the matching events, or an empty list if none match
     * @throws IllegalArgumentException if the category is null or blank
     */
    public List<Event> searchByCategory(String category) {
        if (category == null || category.isBlank()) {
            throw new IllegalArgumentException("Category cannot be empty");
        }
        String text = category.trim();
        List<Event> results = new ArrayList<>();
        for (Event event : repo.getAllEvents()) {
            if (event.getCategory().equalsIgnoreCase(text)) {
                results.add(event);
            }
        }
        return results;
    }

    /**
     * Finds events that take place on the given date.
     *
     * @param date the date to search for
     * @return the matching events, or an empty list if none match
     * @throws IllegalArgumentException if the date is null
     */
    public List<Event> searchByDate(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be empty");
        }
        List<Event> results = new ArrayList<>();
        for (Event event : repo.getAllEvents()) {
            if (date.equals(event.getDate())) {
                results.add(event);
            }
        }
        return results;
    }
}
