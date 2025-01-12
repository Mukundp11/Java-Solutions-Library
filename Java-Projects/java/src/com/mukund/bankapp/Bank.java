package com.mukund.bankapp;

/**
 * The Bank class represents a bank with customer details and operations such as deposit and withdrawal.
 */
public class Bank {
    
    // Instance variables
    private String bankName;
    private String bankCustomerName;
    private String bankAddress;
    private String bankIFSCCode;
    private long customerAccountNumber; // Changed type to long for consistency
    private double currentBalance; // Changed type to double for financial accuracy

    // Method to set bank and customer details
    public void setDetails(String bankName, String bankCustomerName, String bankAddress, 
                           String bankIFSCCode, long customerAccountNumber, double currentBalance) {
        this.bankName = bankName;
        this.bankCustomerName = bankCustomerName;
        this.bankAddress = bankAddress;
        this.bankIFSCCode = bankIFSCCode;
        this.customerAccountNumber = customerAccountNumber;
        this.currentBalance = currentBalance;
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }
        
        if (amount > currentBalance) {
            System.out.println("Insufficient Balance for withdrawal.");
        } else {
            currentBalance -= amount;
            System.out.println("Transaction successful. Amount withdrawn: " + amount);
            showCurrentBalance(); // Show updated balance after withdrawal
        }
        
        if (currentBalance < 1000) {
            System.out.println("Maintain Minimum Balance of 1000.");
        }
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }
        
        currentBalance += amount;
        System.out.println("Deposited successfully: " + amount);
        showCurrentBalance(); // Show updated balance after deposit
    }

    // Method to display the current balance
    public void showCurrentBalance() {
        System.out.printf("Current Balance: %.2f%n", currentBalance); // Format balance to two decimal places
    }

    // Method to display bank details
    public String displayDetails() {
        return toString();
    }

    @Override
    public String toString() {
        return "Bank [bankName=" + bankName + 
               ", bankCustomerName=" + bankCustomerName + 
               ", bankAddress=" + bankAddress + 
               ", bankIFSCCode=" + bankIFSCCode + 
               ", CustomerAccountNumber=" + customerAccountNumber + 
               ", CurrentBalance=" + currentBalance + "]";
    }
}
