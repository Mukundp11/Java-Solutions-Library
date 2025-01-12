package com.mukundit.bankingsystem;

public class BankAccount {
    private int currentBalance; // Current balance in the account

    // Constructor to initialize the account with an initial balance
    public BankAccount(int initialBalance) {
        this.currentBalance = initialBalance;
    }

    // Synchronized method to ensure thread-safe withdrawals
    public synchronized void withdraw(int amount, String customerName) {
        System.out.println(customerName + " is trying to withdraw: " + amount);

        // Check if there are sufficient funds
        if (amount <= currentBalance) {
            System.out.println(customerName + " successfully withdrew: " + amount);
            currentBalance -= amount; // Deduct the amount from the balance
            System.out.println("Remaining balance: " + currentBalance);
        } else {
            System.out.println("Insufficient funds for " + customerName + ". Current balance: " + currentBalance);
        }
    }
}