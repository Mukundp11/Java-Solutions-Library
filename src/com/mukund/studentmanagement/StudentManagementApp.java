package com.mukund.studentmanagement;

/**
 * The StudentManagementApp class serves as the entry point to test the Student class.
 */
public class StudentManagementApp {
    public static void main(String[] args) {
        // Create a new Student object and set its data
        Student student = new Student();
        student.setStudentData(2, "Ravi", 98);
        
        // Calculate the student's grade
        student.calculateGrade();
        
        // Display the student's details
        String details = student.displayDetails();
        System.out.println(details);
    }
}

