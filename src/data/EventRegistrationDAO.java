package data;

import model.Registration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Event;
import java.sql.ResultSet;

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
    public boolean eventExists(int eventId) {

        String sql = "SELECT * FROM events WHERE event_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, eventId);

            ResultSet rs = ps.executeQuery();

            return rs.next(); // true if event exists

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    public Event getEventDetails(int eventId) {

        String sql = "SELECT * FROM events WHERE event_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, eventId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Event(
                        rs.getInt("event_id"),
                        rs.getString("event_name"),
                        rs.getString("location")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}