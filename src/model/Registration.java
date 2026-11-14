package model;

public class Registration {
    private int studentId;
    private int eventId;

    public Registration(int studentId, int eventId) {
        this.studentId = studentId;
        this.eventId = eventId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getEventId() {
        return eventId;
    }
}
