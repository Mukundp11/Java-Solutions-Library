package com.mukund.bankappDetails;

/**
 * The BankApp class serves as an entry point to test the BankAccount class.
 */
public class BankApp {

    public static void main(String[] args) {
        // Create a new BankAccount object with an initial balance and interest rate
        BankAccount account = new BankAccount(1000, 0.10); // 10% interest rate

        // Perform operations on the bank account
        account.deposit(1000); // Deposit $1000
        System.out.println("Current Balance after deposit: " + account.getBalance());

        account.withdraw(500); // Withdraw $500
        System.out.println("Current Balance after withdrawal: " + account.getBalance());

        double interest = account.calculateInterest(); // Calculate interest
        System.out.println("Interest earned: " + interest);
        System.out.println("Current Balance after interest: " + account.getBalance());
    }
}
