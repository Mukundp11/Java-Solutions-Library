package com.mukund.info.employeeDetails;

/**
 * The Employee class represents an employee with a number, name, and salary.
 */
public class Employee {
    private int employeeNumber; // Unique identifier for the employee
    private String employeeName; // Name of the employee
    private double employeeSalary; // Salary of the employee

    // Constructor to initialize employee details
    public Employee(int employeeNumber, String employeeName, double employeeSalary) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    // Getter for employee number
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    // Getter for employee name
    public String getEmployeeName() {
        return employeeName;
    }

    // Getter for employee salary
    public double getEmployeeSalary() {
        return employeeSalary;
    }

    // Method to determine the role based on salary
    public String determineRole() {
        if (employeeSalary >= 90000) {
            return "Developer";
        } else if (employeeSalary >= 60000) {
            return "Designer";
        } else if (employeeSalary == 40000) {
            return "Tester";
        } else {
            return "Role not defined for this salary";
        }
    }
}
