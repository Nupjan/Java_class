package MainProject;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();
    private List<Unit> units = Unit.getUnits();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(String studentID) {
        students.removeIf(s -> s.getId().equals(studentID));
    }

    public void updateStudent(String studentID, String name, double gpa) {
        for (Student student : students) {
            if (student.getId().equals(studentID)) {
                student.setName(name);
                student.setGpa(gpa);
                break;
            }
        }
    }

    public List<Student> lookupStudent(String studentID, String name, String countryOfResidence) {
        return students.stream()
                .filter(s -> (studentID == null || studentID.isEmpty() || s.getId().equals(studentID)))
                .filter(s -> (name == null || name.isEmpty() || s.getName().equalsIgnoreCase(name)))
                .filter(s -> (countryOfResidence == null || countryOfResidence.isEmpty()
                        || (s instanceof InternationalStudent
                                && ((InternationalStudent) s).getCountryOfOrigin()
                                        .equalsIgnoreCase(countryOfResidence))))
                .collect(Collectors.toList()); // Collect all matching students into a list
    }

    public void saveStudentsToFile(String filename) {
        String fullPath = System.getProperty("user.dir") + "\\data\\" + filename;
        File file = new File(fullPath);

        file.getParentFile().mkdirs();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("ID,Name,Unit,GPA,Type,Country,Details\n");
            for (Student student : students) {
                Unit unit = units.stream()
                        .filter(u -> u.getEnrolledStudents().contains(student))
                        .findFirst()
                        .orElse(null);

                String details = unit != null ? unit.getUnitName() + " - " + unit.getLecturer().getName() : "N/A";
                String type = student instanceof DomesticStudent ? "Domestic" : "International";
                String country = student instanceof DomesticStudent ? "Australia"
                        : ((InternationalStudent) student).getCountryOfOrigin();

                writer.write(student.getId() + "," + student.getName() + ","
                        + (unit != null ? unit.getUnitCode() : "N/A") + ","
                        + student.getGpa() + "," + type + "," + country + "," + details + "\n");
            }
            System.out.println("File saved to: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadStudentsFromFile(String filename) {
        String fullPath = System.getProperty("user.dir") + "\\data\\" + filename;
        File file = new File(fullPath);

        if (!file.exists()) {
            System.out.println("File not found: " + fullPath);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            reader.readLine(); // Skip header
            while ((line = reader.readLine()) != null) {
                System.out.println("Read line: " + line);
                String[] data = line.split(",");
                if (data.length == 7) {
                    String studentID = data[0];
                    String name = data[1];
                    String unitCode = data[2];
                    double gpa = Double.parseDouble(data[3]);
                    String type = data[4];
                    String country = data[5];

                    Student student;
                    if (type.equals("Domestic")) {
                        student = new DomesticStudent(studentID, name, gpa, "N/A");
                    } else {
                        student = new InternationalStudent(studentID, name, gpa, country);
                    }

                    Unit unit = Unit.findUnitByCode(unitCode);
                    if (unit != null) {
                        unit.enrollStudent(student);
                    }

                    students.add(student);
                    System.out.println("Added student: " + student);
                } else {
                    System.out.println("Invalid line: " + line);
                }
            }
            System.out.println("Total students loaded: " + students.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Unit> getUnits() {
        return units;
    }

}