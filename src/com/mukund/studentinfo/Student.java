package com.mukund.studentinfo;

/**
 * The Student class represents a student with properties such as ID, name, marks, and grade.
 */
public class Student {
    // Instance variables
    private int studentId;
    private String studentName;
    private int marks;
    private char grade;

    // Method to set student data
    public void setStudentData(int studentId, String studentName, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
        calculateGrade(); // Calculate grade when setting data
    }

    // Method to display student details
    public String displayDetails() {
        return "Name: " + studentName + 
               ", Student ID: " + studentId + 
               ", Marks: " + marks + 
               ", Grade: " + grade;
    }

    // Method to calculate grade based on marks
    private void calculateGrade() {
        if (marks > 90) {
            grade = 'A';
        } else if (marks > 81) {
            grade = 'B';
        } else if (marks > 71) {
            grade = 'C';
        } else if (marks > 61) {
            grade = 'D';
        } else {
            grade = 'E';
        }
    }
    }

