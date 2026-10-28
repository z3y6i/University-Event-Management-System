## Project Overview
The University Event Management System designed to help universities manage campus events efficiently. The system allows students to browse and register for events, event organizers to create and manage events, and administrators to supervise the overall event process.Students can search for events, view event details, register for events, cancel registrations, and provide feedback. Event organizers can create, edit, and cancel events, as well as manage attendance and view participant information. Administrators can manage users, approve or reject event requests, monitor events, and generate reports. The main objective of the system is to simplify event management, improve communication between students and organizers, and provide an organized platform for handling university activities.


## Project Structure
This is a Maven project. Code stays in the existing layered folders:

```
src/presentation   UI classes
src/business       business logic (services)
src/data           data classes and repositories
test/              JUnit test classes
```

## How to Build and Run Tests
You do **not** need Maven installed. The Maven Wrapper downloads it automatically.

- **IntelliJ:** open the project folder; IntelliJ loads `pom.xml` automatically (if asked, click *Load Maven Project*). Use the Maven tool window or right-click a test to run it.
- **Terminal (macOS/Linux):** `./mvnw test`
- **Terminal (Windows):** `mvnw.cmd test`
