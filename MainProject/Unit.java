package MainProject;

import java.util.ArrayList;
import java.util.List;

public class Unit {
    private String unitCode;
    private String unitName;
    private int creditPoints;
    private Lecturer lecturer;
    private List<Student> enrolledStudents = new ArrayList<>();

    // Hardcoded list of units
    private static final List<Unit> units = new ArrayList<>();

    static {
        // Initialize the list of units
        units.add(new Unit("CS101", "Introduction to Computer Science", 3, Lecturer.getLecturers().get(0)));
        units.add(new Unit("MATH101", "Calculus I", 4, Lecturer.getLecturers().get(1)));
        units.add(new Unit("PHYS101", "Physics I", 4, Lecturer.getLecturers().get(2)));
        units.add(new Unit("ENG101", "Introduction to Engineering", 3, Lecturer.getLecturers().get(3)));
        units.add(new Unit("BIO101", "Biology I", 4, Lecturer.getLecturers().get(4)));
        units.add(new Unit("CHEM101", "Chemistry I", 4, Lecturer.getLecturers().get(5)));
        units.add(new Unit("PSY101", "Introduction to Psychology", 3, Lecturer.getLecturers().get(6)));
        units.add(new Unit("ECON101", "Principles of Economics", 3, Lecturer.getLecturers().get(7)));
        units.add(new Unit("HIST101", "World History", 3, Lecturer.getLecturers().get(8)));
        units.add(new Unit("LIT101", "Introduction to Literature", 3, Lecturer.getLecturers().get(9)));
    }

    public Unit(String unitCode, String unitName, int creditPoints, Lecturer lecturer) {
        this.unitCode = unitCode;
        this.unitName = unitName;
        this.creditPoints = creditPoints;
        this.lecturer = lecturer;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(int creditPoints) {
        this.creditPoints = creditPoints;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        } else {
            throw new IllegalArgumentException("Student is already enrolled in this unit.");
        }
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    // Find a unit by its code
    public static Unit findUnitByCode(String unitCode) {
        for (Unit unit : units) {
            if (unit.getUnitCode().equals(unitCode)) {
                return unit;
            }
        }
        return null;
    }

    // Get the list of hardcoded units
    public static List<Unit> getUnits() {
        return units;
    }

    @Override
    public String toString() {
        return "Unit Code: " + unitCode + ", Unit Name: " + unitName + ", Credit Points: " + creditPoints +
                ", Lecturer: " + lecturer.getName() + ", Enrolled Students: " + enrolledStudents.size();
    }
}