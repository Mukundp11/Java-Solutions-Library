package com.mukund.studentDetails;

/**
 * The StudentDetail class provides a method to retrieve student details.
 */
public class StudentDetail {

    /**
     * Gets the details of a student.
     *
     * @param roll The roll number of the student.
     * @param name The name of the student.
     * @param fee  The fee amount for the student.
     * @return A formatted string containing the student's details.
     */
    public static String getStudentDetails(int roll, String name, double fee) {
        // Constructing the details string
        String details = "Roll no is: " + roll + 
                         "\nName is: " + name + 
                         "\nFees is: " + fee;
        
        return details; // Return the formatted details
    }
}
