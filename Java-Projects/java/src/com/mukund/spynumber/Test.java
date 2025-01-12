package com.mukund.spynumber;

import java.util.Scanner;

/**
 * The Test class serves as an entry point to demonstrate the functionality of the SpyNumber class.
 */
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number to check if it's a spy number: ");
        int number = scanner.nextInt();

        // Check if the entered number is a spy number
        boolean result = SpyNumber.isSpyNumber(number);

        // Output the result
        if (result) {
            System.out.println(number + " is a Spy Number.");
        } else {
            System.out.println(number + " is not a Spy Number.");
        }

        scanner.close(); // Close the scanner resource
    }
}
