package com.mukund.employee.management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeManagementApp {

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rahul Sharma", 101, 45000.0));
        employees.add(new Employee("Priya Singh", 102, 38000.0));
        employees.add(new Employee("Amit Patel", 103, 52000.0));
        employees.add(new Employee("Neha Gupta", 104, 41000.0));

        // Display employees before sorting
        System.out.println("Employees before sorting:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Sort employees by salary
        Collections.sort(employees);

        // Display employees after sorting
        System.out.println("\nEmployees after sorting by salary (ascending order):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}