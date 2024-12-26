package com.mukund.empDetails;
/**
 * The ELCTest class serves as an entry point to test the Employee class.
 */
public class ELCTest {

    public static void main(String[] args) {
        // Create an Employee object
        Employee e1 = new Employee("Ravi", 40, 12000, "Java");
        
        // Create a copy of the first employee using the copy constructor
        Employee e2 = new Employee(e1);

        // Display initial salary of e1 and details of e2
        System.out.println("Initial Salary of e1: " + e1.getSalary());
        System.out.println("Details of e2: " + e2.toString());

        // Raise the salary of e2 by 10%
        e2.raiseSalary(10);
        
        // Display updated salary of e2
        System.out.println("Updated Salary of e2: " + e2.getSalary());
    }
}
