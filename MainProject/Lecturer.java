package MainProject;

import java.util.ArrayList;
import java.util.List;

public class Lecturer {
    private String staffID;
    private String name;
    private String department;

    // Hardcoded list of lecturers
    private static final List<Lecturer> lecturers = new ArrayList<>();

    static {
        // Initialize the list of lecturers
        lecturers.add(new Lecturer("L001", "Dr. Emily Carter", "Computer Science"));
        lecturers.add(new Lecturer("L002", "Prof. James Wilson", "Mathematics"));
        lecturers.add(new Lecturer("L003", "Dr. Sarah Lee", "Physics"));
        lecturers.add(new Lecturer("L004", "Prof. Michael Brown", "Engineering"));
        lecturers.add(new Lecturer("L005", "Dr. Olivia Davis", "Biology"));
        lecturers.add(new Lecturer("L006", "Prof. Daniel Martinez", "Chemistry"));
        lecturers.add(new Lecturer("L007", "Dr. Sophia Taylor", "Psychology"));
        lecturers.add(new Lecturer("L008", "Prof. William Anderson", "Economics"));
        lecturers.add(new Lecturer("L009", "Dr. Ava Thomas", "History"));
        lecturers.add(new Lecturer("L010", "Prof. Noah Garcia", "Literature"));
    }

    public Lecturer(String staffID, String name, String department) {
        this.staffID = staffID;
        this.name = name;
        this.department = department;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Get the list of hardcoded lecturers
    public static List<Lecturer> getLecturers() {
        return lecturers;
    }

    @Override
    public String toString() {
        return "Staff ID: " + staffID + ", Name: " + name + ", Department: " + department;
    }
}