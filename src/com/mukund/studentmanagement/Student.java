
package com.mukund.studentmanagement;
/**
 * The Student class represents a student with attributes such as ID, name, marks, and grade.
 */
public class Student {
    // Instance variables
    private int studentId;
    private String studentName;
    private int marks;
    private char grade;

    /**
     * Sets the student's data.
     *
     * @param studentId   The ID of the student.
     * @param studentName The name of the student.
     * @param marks       The marks obtained by the student.
     */
    public void setStudentData(int studentId, String studentName, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    /**
     * Displays the details of the student.
     *
     * @return A string representation of the student's details.
     */
    public String displayDetails() {
        return "Name: " + studentName + ", Student ID: " + studentId + ", Marks: " + marks + ", Grade: " + grade;
    }

    /**
     * Calculates the grade based on the marks obtained.
     */
    public void calculateGrade() {
        if (marks > 90) {
            grade = 'A';
        } else if (marks > 81 && marks <= 90) {
            grade = 'B';
        } else if (marks > 71 && marks <= 80) {
            grade = 'C';
        } else if (marks > 61 && marks <= 70) {
            grade = 'D';
        } else {
            grade = 'E';
        }
    }
}
