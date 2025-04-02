# Student Management System - README

## Target Grade: HD (High Distinction)

This project is a **Student Management System** implemented in Java, designed to manage student records, lecturers, and units. It includes a **Graphical User Interface (GUI)** built using **Swing**, and it demonstrates several **Object-Oriented Programming (OOP)** concepts. The system also supports **data persistence** by saving and loading student data to/from a CSV file.

---

## UML Diagrams


### 1. `Person` Class (Abstract)
```
Person
-----------
- id: String
- name: String
-----------
+ Person(String id, String name)
+ getId(): String
+ setId(String id): void
+ getName(): String
+ setName(String name): void
+ getDetails(): String (abstract)
```

### 2. `Student` Class (Extends `Person`)
```
Student
-----------
- gpa: double
-----------
+ Student(String studentID, String name, double gpa)
+ getGpa(): double
+ setGpa(double gpa): void
+ getDetails(): String (overrides)
```

### 3. `DomesticStudent` Class (Extends `Student`)
```
DomesticStudent
-----------
- stateOfResidence: String
-----------
+ DomesticStudent(String studentID, String name, double gpa, String stateOfResidence)
+ getStateOfResidence(): String
+ setStateOfResidence(String stateOfResidence): void
+ toString(): String (overrides)
```

### 4. `InternationalStudent` Class (Extends `Student`)
```
InternationalStudent
-----------
- countryOfOrigin: String
-----------
+ InternationalStudent(String studentID, String name, double gpa, String countryOfOrigin)
+ getCountryOfOrigin(): String
+ setCountryOfOrigin(String countryOfOrigin): void
+ toString(): String (overrides)
```

### 5. `Lecturer` Class
```
Lecturer
-----------
- staffID: String
- name: String
- department: String
-----------
+ Lecturer(String staffID, String name, String department)
+ getStaffID(): String
+ setStaffID(String staffID): void
+ getName(): String
+ setName(String name): void
+ getDepartment(): String
+ setDepartment(String department): void
+ toString(): String
```

### 6. `Unit` Class
```
Unit
-----------
- unitCode: String
- unitName: String
- creditPoints: int
- lecturer: Lecturer
- enrolledStudents: List<Student>
-----------
+ Unit(String unitCode, String unitName, int creditPoints, Lecturer lecturer)
+ getUnitCode(): String
+ setUnitCode(String unitCode): void
+ getUnitName(): String
+ setUnitName(String unitName): void
+ getCreditPoints(): int
+ setCreditPoints(int creditPoints): void
+ getLecturer(): Lecturer
+ setLecturer(Lecturer lecturer): void
+ getEnrolledStudents(): List<Student>
+ enrollStudent(Student student): void
+ removeStudent(Student student): void
+ toString(): String
```

### 7. `StudentManagementSystem` Class
```
StudentManagementSystem
-----------
- students: List<Student>
- units: List<Unit>
-----------
+ addStudent(Student student): void
+ deleteStudent(String studentID): void
+ updateStudent(String studentID, String name, double gpa): void
+ lookupStudent(String studentID): Student
+ saveStudentsToFile(String filename): void
+ loadStudentsFromFile(String filename): void
+ getStudents(): List<Student>
+ getUnits(): List<Unit>
+ filterStudents(String name, String major, String lecturerName, String unitCode): List<Student>
```

### 8. `StudentManagementGUI` Class
```
StudentManagementGUI
-----------
- system: StudentManagementSystem
- studentTable: JTable
- tableScrollPane: JScrollPane
-----------
+ StudentManagementGUI()
+ addStudent(JComboBox<String>, JTextField, JTextField, JComboBox<String>, JTextField, JTextField, JComboBox<String>): void
+ deleteStudent(JTextField): void
+ updateStudent(JTextField, JTextField, JComboBox<String>, JTextField, JTextField, JComboBox<String>): void
+ listAllStudents(): void
+ updateTable(List<Student>): void
```

---

## Function Explanations

### Core Functions

1. **Add Student**:
   - **Description**: Allows user to add new student record. Student can be either a `DomesticStudent` or an `InternationalStudent`.
   - **Use Case**: The user selects the student type, enters the student's ID, name, GPA, and additional details, then added to the system.
   - This function is essential for creating and managing student records. It uses **inheritance** to handle different types of students.

2. **Delete Student**:
   - **Description**: Allows user to delete student records by entering student's IDs.
   - **Use Case**: User enters student ID, system removes student from list of students.

3. **Update Student**:
   - **Description**: Allows user to update student's name, GPA, and other details by entering the student's ID.
   - **Use Case**: User enters student ID and updates the relevant fields then the system updates the student's information.
   - This function ensures that student records can be kept up-to-date.

4. **Lookup Student**:
   - **Description**: Allows user to search for student by ID and display relevant details.
   - **Use Case**: User enters student ID, and system displays the student's information in the GUI table.
   - This function retrieves student information easily.

5. **Save Students to File**:
   - **Description**: Saves list of students to a CSV file for data persistence.
   - **Use Case**: User on click on "Save" button, system writes the student data to a CSV file.
   - This function ensures that student data is not lost when the program is closed.

6. **Load Students from File**:
   - **Description**: Loads list of students from a CSV file.
   - **Use Case**: User on click on "Load" button, system reads data from a CSV file and imports it onto the GUI table.
   - This function allows system to retrieve previously saved student data.

7. **Filter Students**:
   - **Description**: Allows user to filter students based on name, Unit, lecturer or countryOfOrigin.
   - **Use Case**: User enters filter criteria, and system displays the matching students in the GUI table.
   - This function provides advanced search capabilities.

---

## OOP Concept Explanations

1. **Encapsulation**:
   -  All class attributes are private, and access is provided through public getter and setter methods. For example, the `Student` class has private attributes like `gpa`, which can only be accessed or modified through `getGpa()` and `setGpa()`.
   - This encapsulation ensures that the internal state of an object is protected from misuse or corruption.

2. **Inheritance**:
   - The `Student` class inherits from `Person` class, and `DomesticStudent` and `InternationalStudent` inherit from `Student`. This allows for code reuse and a clear hierarchy.
   - Inheritance is used to model  relationship between classes (e.g., a `DomesticStudent` is a `Student`).

3. **Polymorphism**:
   - The `toString()` method is overridden in the `DomesticStudent` and `InternationalStudent` classes to provide specific implementations. This allows the same method to behave differently.
   - Polymorphism is used for flexible and extendable code, as new subclasses can be added without modifying existing code.

4. **Abstraction**:
   - The `Person` class is abstract and includes an abstract method `getDetails()`. This method is implemented in the `Student` class.
   - Abstraction allows for defining a common interface while hiding the implementation details.

5. **Exception Handling**:
   - The system includes exception handling for invalid input (e.g., invalid GPA values) and file operations (e.g., file not found).
   - Exception handling ensures that the system can gracefully handle errors and provide meaningful feedback to the user.

---

## How the Requirements Are Met

1. **Add Student**:
   - The system allows adding new student records with unique IDs, names, majors, and GPAs. This is implemented in the `addStudent` method in the `StudentManagementSystem` class.

2. **Delete Student**:
   - The system allows deleting student records by ID. This is implemented in the `deleteStudent` method.

3. **Update Student**:
   - The system allows updating student information (name, major, GPA) by ID. This is implemented in the `updateStudent` method.

4. **Lookup Student**:
   - The system allows searching for a student by ID and displaying their details. This is implemented in the `lookupStudent` method.

5. **Use Classes and Objects**:
   - The system uses classes like `Student`, `Lecturer`, and `Unit` to represent entities.

6. **Encapsulation**:
   - All class attributes are private, and access is provided through getters and setters.

7. **Inheritance**:
   - The `Student` class inherits from `Person`, and `DomesticStudent` and `InternationalStudent` inherit from `Student`.

8. **Polymorphism**:
   - The `toString()` method is overridden in subclasses to demonstrate polymorphism.

9. **Data Persistence**:
   - The system supports saving and loading student data to/from a CSV file.

10. **Exception Handling**:
    - Comprehensive exception handling is implemented for invalid input and file operations.

11. **University Entities and Relationships**:
    - The `Lecturer` and `Unit` classes are implemented, and students can be enrolled in units.

12. **Abstraction**:
    - The `Person` class is abstract, and the `getDetails()` method is implemented in the `Student` class.

13. **Advanced Filter**:
    - The system allows filtering students based on name, major, lecturer, or enrolled unit.

---

## References

### Java Libraries Used
    Java Swing:

        Description: Used for creating the Graphical User Interface (GUI) for the Student Management System.

        Official Documentation: Java Swing Documentation

        Tutorial: Java Swing Tutorial

    Java I/O (Input/Output):

        Description: Used for reading from and writing to CSV files for data persistence.

        Official Documentation: Java I/O Documentation

        Tutorial: Java I/O Tutorial

    Java Collections Framework:

        Description: Used for managing lists of students, units, and lecturers.

        Official Documentation: Java Collections Documentation

        Tutorial: Java Collections Tutorial

YouTube Videos for Similar Concepts

    Java Swing GUI Tutorial:

        Java Swing GUI Tutorial by Derek Banas

        Description: A comprehensive tutorial on creating GUIs using Java Swing.

    Object-Oriented Programming in Java:

        OOP in Java by Telusko

        Description: A detailed explanation of OOP concepts like inheritance, polymorphism, and encapsulation in Java.

    File Handling in Java:

        File Handling in Java by CodeWithHarry

        Description: A tutorial on reading from and writing to files in Java.

AI Tools for Text Formatting and Debugging

    ChatGPT:

        Description: Used for generating and formatting text in the README file, as well as debugging assistance.

        Website: ChatGPT

    GitHub Copilot:

        Description: An AI-powered code completion tool that assists in writing and debugging code.

        Website: GitHub Copilot

