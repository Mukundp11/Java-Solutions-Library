package com.mukund.employees;

/**
 * The MainElc class serves as an entry point to test the Employee class.
 */
public class MainDemo{

    public static void main(String[] args) {
        // Create multiple Employee objects based on user input
        Employee em1 = Employee.getEmployeeObject();
        System.out.println("----------------------------");
        
        Employee em2 = Employee.getEmployeeObject();
        System.out.println("----------------------------");
        
        Employee em3 = Employee.getEmployeeObject();
        System.out.println("----------------------------");
        
        Employee em4 = Employee.getEmployeeObject();
        System.out.println("----------------------------");
        
        Employee em5 = Employee.getEmployeeObject();
        
        // Print details of all employees
        System.out.println(em1);
    /*    System.out.println(em2);
        System.out.println(em3);
        System.out.println(em4);
        System.out.println(em5); */
    }
}
