package com.mukund.billing;


/**
 * The MainApp class serves as an entry point to test the billing calculations.
 */
public class MainApp {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the initial bill amount as a command line argument.");
            return;
        }

        try {
            int bill = Integer.parseInt(args[0]); // Parse the bill amount from command line arguments
            int finalBill = BillCalculator.calculateFinalBill(bill); // Calculate final bill
            System.out.println("Final Bill after discount: " + finalBill);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer for the bill amount.");
        }
    }
}

