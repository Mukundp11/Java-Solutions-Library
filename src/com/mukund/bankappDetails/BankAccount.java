package com.mukund.bankappDetails;

/**
 * The BankAccount class represents a bank account with a balance and interest rate.
 */
public class BankAccount {
    private double balance;      // Current balance of the account
    private double interestRate; // Interest rate for the account

    // Instance initializer block to set default interest rate
    {
        interestRate = 0.01; // Default interest rate of 1%
    }

    // Constructor to initialize balance and interest rate
    public BankAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Update the balance
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Update the balance
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to calculate interest on the current balance
    public double calculateInterest() {
        double interest = (balance * interestRate);
        balance += interest; // Update the balance with interest
        return interest; // Return the calculated interest
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}
