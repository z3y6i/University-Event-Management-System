package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateEventRepoTest {

    @Test
    public void saveEventSuccessfully() {

        CreateEventRepo repo = new CreateEventRepo();

        repo.saveEvent("Workshop Event");

        assertEquals(1, repo.getEvents().size());
    }

    @Test
    public void retrieveStoredEvents() {

        CreateEventRepo repo = new CreateEventRepo();

        repo.saveEvent("Event 1");
        repo.saveEvent("Event 2");

        assertEquals(2, repo.getEvents().size());
    }
}