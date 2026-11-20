package business;

import java.time.LocalDate;

public class CreateEventService {

    public CreateEventService() {
    }

    public boolean createEvent(String name, String location, String description, LocalDate date, int capacity) {
        if (name == null || name.isBlank()) {
            return false;
        }
        if (location == null || location.isBlank()) {
            return false;
        }
        if (description == null || description.isBlank()) {
            return false;
        }
        if (date == null) {
            return false;
        }
        if (capacity <= 0) {
            return false;
        }
        return true;
    }
}

