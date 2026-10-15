package data;

import model.Registration;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class EventRegistrationDAO {

    public boolean registerStudent(Registration registration) {

        String sql =
                "INSERT INTO registrations(student_id, event_id) VALUES(?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, registration.getStudentId());
            ps.setInt(2, registration.getEventId());

            return ps.executeUpdate() > 0;

        } catch(Exception e) {
            System.out.println("Student is already registered for this event.");
        }


        return false;
    }
}