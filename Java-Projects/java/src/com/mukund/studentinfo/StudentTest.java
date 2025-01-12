package com.mukund.studentinfo;

/**
 * The StudentTest class serves as an entry point to test the Student class.
 */
public class StudentTest {

    public static void main(String[] args) {
        // Create a new Student object and set data
        Student s = new Student();
        s.setStudentData(2, "Ravi", 98);

        // Display student details
        String displayDetails = s.displayDetails();
        System.out.println(displayDetails);
    }
}
