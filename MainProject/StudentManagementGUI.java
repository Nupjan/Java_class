package MainProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class StudentManagementGUI extends JFrame {
    private StudentManagementSystem system = new StudentManagementSystem();
    private JTable studentTable;
    private JScrollPane tableScrollPane;

    public StudentManagementGUI() {
        setTitle("Student Management System");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the main panel
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Create the student information panel
        JPanel studentInfoPanel = new JPanel(new GridLayout(7, 2));
        studentInfoPanel.setBorder(BorderFactory.createTitledBorder("Student Information"));

        JComboBox<String> studentTypeComboBox = new JComboBox<>(new String[] { "Domestic", "International" });
        JTextField studentIDField = new JTextField();
        JTextField nameField = new JTextField();
        JComboBox<String> unitComboBox = new JComboBox<>();
        JTextField gpaField = new JTextField();
        JTextField countryField = new JTextField();
        JComboBox<String> stateComboBox = new JComboBox<>(new String[] { "Sydney", "Brisbane", "Melbourne" });

        // Populate the unit combo box
        for (Unit unit : system.getUnits()) {
            unitComboBox.addItem(unit.getUnitCode());
        }

        studentInfoPanel.add(new JLabel("Student Type:"));
        studentInfoPanel.add(studentTypeComboBox);
        studentInfoPanel.add(new JLabel("Student ID:"));
        studentInfoPanel.add(studentIDField);
        studentInfoPanel.add(new JLabel("Name:"));
        studentInfoPanel.add(nameField);
        studentInfoPanel.add(new JLabel("Unit:"));
        studentInfoPanel.add(unitComboBox);
        studentInfoPanel.add(new JLabel("GPA:"));
        studentInfoPanel.add(gpaField);
        studentInfoPanel.add(new JLabel("Country of Origin:"));
        studentInfoPanel.add(countryField);
        studentInfoPanel.add(new JLabel("State of Residence:"));
        studentInfoPanel.add(stateComboBox);

        // Add listener to student type combo box
        studentTypeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (studentTypeComboBox.getSelectedItem().equals("Domestic")) {
                    countryField.setText("Australia");
                    countryField.setEditable(false);
                } else {
                    countryField.setText("");
                    countryField.setEditable(true);
                }
            }
        });

        // Create the button panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");
        JButton updateButton = new JButton("Update");
        JButton lookupButton = new JButton("Lookup");
        JButton saveButton = new JButton("Save");
        JButton loadButton = new JButton("Load");
        JButton listAllButton = new JButton("List All");

        // Set preferred button size
        Dimension buttonSize = new Dimension(100, 30);
        addButton.setPreferredSize(buttonSize);
        deleteButton.setPreferredSize(buttonSize);
        updateButton.setPreferredSize(buttonSize);
        lookupButton.setPreferredSize(buttonSize);
        saveButton.setPreferredSize(buttonSize);
        loadButton.setPreferredSize(buttonSize);
        listAllButton.setPreferredSize(buttonSize);

        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(lookupButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(loadButton);
        buttonPanel.add(listAllButton);

        // Create the student table
        String[] columnNames = { "ID", "Name", "Unit", "GPA", "Type", "Country", "Details" };
        Object[][] data = {};
        studentTable = new JTable(data, columnNames);
        tableScrollPane = new JScrollPane(studentTable);

        // Add components to the main panel
        mainPanel.add(studentInfoPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(tableScrollPane, BorderLayout.SOUTH);

        // Add the main panel to the frame
        add(mainPanel);

        // Add action listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent(studentTypeComboBox, studentIDField, nameField, unitComboBox, gpaField, countryField,
                        stateComboBox);
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteStudent(studentIDField);
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateStudent(studentIDField, nameField, unitComboBox, gpaField, countryField, stateComboBox);
            }
        });

        lookupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentID = JOptionPane.showInputDialog(StudentManagementGUI.this, "Enter Student ID:");
                String name = JOptionPane.showInputDialog(StudentManagementGUI.this, "Enter Student Name:");
                String countryOfResidence = JOptionPane.showInputDialog(StudentManagementGUI.this,
                        "Enter Student Origins:");

                if ((studentID == null || studentID.isEmpty())
                        && (name == null || name.isEmpty())
                        && (countryOfResidence == null || countryOfResidence.isEmpty())) {
                    JOptionPane.showMessageDialog(StudentManagementGUI.this,
                            "Please enter at least one search criteria!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Get all matching students
                List<Student> filteredStudents = system.lookupStudent(studentID, name, countryOfResidence);
                if (!filteredStudents.isEmpty()) {
                    // Update the table with all matching students
                    updateTable(filteredStudents);
                } else {
                    JOptionPane.showMessageDialog(StudentManagementGUI.this, "No students found!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                system.saveStudentsToFile("students.csv");
                JOptionPane.showMessageDialog(StudentManagementGUI.this, "Students saved to file!", "File Saved",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                system.loadStudentsFromFile("students.csv");
                listAllStudents();
                JOptionPane.showMessageDialog(StudentManagementGUI.this, "Students loaded from file!", "File Loaded",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        listAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listAllStudents();
            }
        });

        // Display the GUI
        setVisible(true);
    }

    private void addStudent(JComboBox<String> studentTypeComboBox, JTextField studentIDField, JTextField nameField,
            JComboBox<String> unitComboBox, JTextField gpaField, JTextField countryField,
            JComboBox<String> stateComboBox) {
        try {
            String studentID = studentIDField.getText();
            String name = nameField.getText();
            String unitCode = (String) unitComboBox.getSelectedItem();
            double gpa = Double.parseDouble(gpaField.getText());
            String country = countryField.getText();
            String state = (String) stateComboBox.getSelectedItem();

            if (gpa < 0.0 || gpa > 4.0) {
                throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
            }

            Student student;
            if (studentTypeComboBox.getSelectedItem().equals("Domestic")) {
                student = new DomesticStudent(studentID, name, gpa, state);
            } else {
                student = new InternationalStudent(studentID, name, gpa, country);
            }

            Unit unit = Unit.findUnitByCode(unitCode);
            if (unit != null) {
                unit.enrollStudent(student);
            }

            system.addStudent(student);
            listAllStudents();
            JOptionPane.showMessageDialog(this, "Student added successfully!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid GPA! Please enter a number.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteStudent(JTextField studentIDField) {
        String studentID = studentIDField.getText();
        system.deleteStudent(studentID);
        listAllStudents();
        JOptionPane.showMessageDialog(this, "Student deleted successfully!");
    }

    private void updateStudent(JTextField studentIDField, JTextField nameField, JComboBox<String> unitComboBox,
            JTextField gpaField, JTextField countryField, JComboBox<String> stateComboBox) {
        String studentID = studentIDField.getText();
        Student student = system.lookupStudent(studentID);
        if (student != null) {
            try {
                student.setName(nameField.getText());
                student.setGpa(Double.parseDouble(gpaField.getText()));

                if (student instanceof DomesticStudent) {
                    ((DomesticStudent) student).setStateOfResidence((String) stateComboBox.getSelectedItem());
                } else if (student instanceof InternationalStudent) {
                    ((InternationalStudent) student).setCountryOfOrigin(countryField.getText());
                }

                Unit unit = Unit.findUnitByCode((String) unitComboBox.getSelectedItem());
                if (unit != null) {
                    unit.enrollStudent(student);
                }

                listAllStudents();
                JOptionPane.showMessageDialog(this, "Student updated successfully!");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid GPA! Please enter a number.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Student not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void listAllStudents() {
        List<Student> students = system.getStudents();
        System.out.println("Total students in system: " + students.size()); // Debugging
        updateTable(students);
    }

    // Helper method to update the table with a list of students
    private void updateTable(List<Student> students) {
        Object[][] data = new Object[students.size()][7]; // Now 7 columns
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            Unit unit = system.getUnits().stream()
                    .filter(u -> u.getEnrolledStudents().contains(student))
                    .findFirst()
                    .orElse(null);

            data[i][0] = student.getId();
            data[i][1] = student.getName();
            data[i][2] = unit != null ? unit.getUnitCode() : "N/A";
            data[i][3] = student.getGpa();
            data[i][4] = student instanceof DomesticStudent ? "Domestic" : "International";
            data[i][5] = student instanceof DomesticStudent ? "Australia"
                    : ((InternationalStudent) student).getCountryOfOrigin();
            data[i][6] = unit != null ? unit.getUnitName() + " - " + unit.getLecturer().getName() : "N/A";

            System.out.println("Adding to table: " + student.getId() + ", " + student.getName());
        }

        String[] columnNames = { "ID", "Name", "Unit", "GPA", "Type", "Country", "Details" };
        studentTable.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StudentManagementGUI().setVisible(true);
        });
    }
}