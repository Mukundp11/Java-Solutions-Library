package com.mukund.bankapp;

import java.util.Scanner;

/**
 * The BankTest class serves as an entry point to test the Bank class.
 */
public class BankTest {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Input details from user
        System.out.print("Enter Bank Name: ");
        String bankName = sc.nextLine();
        
        System.out.print("Enter Customer Name: ");
        String bankCustomerName = sc.nextLine();
        
        System.out.print("Enter Customer Address: ");
        String bankAddress = sc.nextLine();
        
        System.out.print("Enter Bank IFSC Code: ");
        String bankIFSCCode = sc.nextLine();
        
        System.out.print("Enter Account Number: ");
        long customerAccountNumber = sc.nextLong();
        
        System.out.print("Enter Current Balance: ");
        double currentBalance = sc.nextDouble(); // Changed to double for consistency
        
        sc.close(); // Close the scanner resource
        
        // Create a new Bank object and set details
        Bank b = new Bank();
        b.setDetails(bankName, bankCustomerName, bankAddress, bankIFSCCode, customerAccountNumber, currentBalance);
        
        // Perform operations
        b.withdraw(100); // Example withdrawal
        b.deposit(200);  // Example deposit
        b.showCurrentBalance(); // Display current balance
        System.out.println(b.displayDetails()); // Display all details of the account
    }
}
