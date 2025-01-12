package com.mukundit.bankingsystem;

public class WithdrawTask implements Runnable {
    private BankAccount account; // The bank account to withdraw from
    private int withdrawAmount; // The amount to withdraw
    private String customerName; // The name of the customer

    // Constructor to initialize the task
    public WithdrawTask(BankAccount account, int withdrawAmount, String customerName) {
        this.account = account;
        this.withdrawAmount = withdrawAmount;
        this.customerName = customerName;
    }

    // The run method is executed when the thread starts
    @Override
    public void run() {
        account.withdraw(withdrawAmount, customerName); // Perform the withdrawal
    }
}