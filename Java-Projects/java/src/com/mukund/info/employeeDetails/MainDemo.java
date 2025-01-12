package com.mukund.info.employeeDetails;

/**
 * The Employee_ElC class serves as an entry point to test the Employee class.
 */
public class MainDemo {

    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(12, "Ravi", 90000);

        // Print out the role of the employee based on salary
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Role: " + emp.determineRole());
    }
}
