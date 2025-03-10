package MainProject;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Major: ");
        String major = scanner.nextLine();
        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        students.add(new Student(studentID, name, major, gpa));
        System.out.println("Student added successfully!");
    }

    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        String studentID = scanner.nextLine();
        students.removeIf(student -> student.getStudentID().equals(studentID));
        System.out.println("Student deleted successfully!");
    }

    public void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        String studentID = scanner.nextLine();
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                System.out.print("Enter new Name: ");
                student.setName(scanner.nextLine());
                System.out.print("Enter new Major: ");
                student.setMajor(scanner.nextLine());
                System.out.print("Enter new GPA: ");
                student.setGpa(scanner.nextDouble());
                scanner.nextLine(); // Consume newline
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void lookupStudent() {
        System.out.print("Enter Student ID to lookup: ");
        String studentID = scanner.nextLine();
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                System.out.println("Student ID: " + student.getStudentID());
                System.out.println("Name: " + student.getName());
                System.out.println("Major: " + student.getMajor());
                System.out.println("GPA: " + student.getGpa());
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Lookup Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    lookupStudent();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        system.displayMenu();
    }
}
