package com.mukund.employees;

import java.util.Scanner;

/**
 * The Employee class represents an employee with an ID, name, and salary.
 */
public class Employee {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    // Constructor to initialize employee details
    public Employee(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    // Method to create and return an Employee object based on user input
    public static Employee getEmployeeObject() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter employee ID: ");
        int eid = sc.nextInt();
        
        sc.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter employee Name: ");
        String ename = sc.nextLine();
        
        System.out.print("Enter employee Salary: ");
        double emsalary = sc.nextDouble();

        sc.close();
        return new Employee(eid, ename, emsalary);
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + 
               ", employeeSalary=" + employeeSalary + "]";
    }
}
