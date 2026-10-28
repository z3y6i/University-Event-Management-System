package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegistrationTest {

    @Test
    void testRegistrationConstructor() {

        Registration registration =
                new Registration(100, 1);

        assertEquals(100,
                registration.getStudentId());

        assertEquals(1,
                registration.getEventId());
    }
}