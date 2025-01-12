package com.mukund.employeeapp;

import java.util.Scanner;

/**
 * The ELC_Add_Emp class serves as an entry point to test the Employee and Address classes.
 */
public class MainDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Address
        System.out.print("Enter City Name: ");
        String cityName = scanner.nextLine();

        System.out.print("Enter District Name: ");
        String districtName = scanner.nextLine();

        System.out.print("Enter State Name: ");
        String stateName = scanner.nextLine();

        // Create Address object
        Address ad = new Address(cityName, districtName, stateName);

        // Input for Employee
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        // Create Employee object with the address
        Employee em = new Employee(empId, empName, ad);
        
        // Print employee details
        System.out.println(em);

        scanner.close(); // Close the scanner resource
    }
}
