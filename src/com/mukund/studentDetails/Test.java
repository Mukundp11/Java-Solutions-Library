package com.mukund.studentDetails;

/**
 * The Test class serves as an entry point to demonstrate the functionality of the StudentDetail class.
 */
public class Test {

    public static void main(String[] args) {
        // Example student details
        int rollNumber = 101; // Sample roll number
        String studentName = "Ravi"; // Sample student name
        double feeAmount = 14000; // Sample fee amount
        
        // Retrieve student details using the StudentDetail class
        String result = StudentDetail.getStudentDetails(rollNumber, studentName, feeAmount);
        
        // Print the formatted student details
        System.out.println(result);
    }
}
