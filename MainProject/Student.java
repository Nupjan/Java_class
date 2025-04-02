package MainProject;

public class Student extends Person {
    private double gpa;

    public Student(String studentID, String name, double gpa) {
        super(studentID, name);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        this.gpa = gpa;
    }

    @Override
    public String getDetails() {
        return "Student ID: " + getId() + ", Name: " + getName() + ", GPA: " + gpa;
    }
}