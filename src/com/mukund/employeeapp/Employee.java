package com.mukund.employeeapp;

/**
 * The Employee class represents an employee with ID, name, and address information.
 */
public class Employee {
    private int empId;
    private String empName;
    private Address address;

    // Constructor to initialize employee details
    public Employee(int empId, String empName, Address address) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [ID: " + empId + ", Name: " + empName + ", Address: " + address + "]";
    }
}
