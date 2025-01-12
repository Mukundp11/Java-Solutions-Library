package com.mukund.numbercheck;

/**
 * The Main class serves as the entry point to test the EvenOrOdd class.
 */
public class Main {

    public static void main(String[] args) {
        EvenOrOdd checker = new EvenOrOdd(); // Create an instance of EvenOrOdd
        
        // Test the isEven method with sample inputs
        int number = 5; // Change this value to test other numbers
        boolean result = checker.isEven(number);
        
        // Output the result
        if (result) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
