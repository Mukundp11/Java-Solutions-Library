package com.mukundit.bankingsystem;

public class BankingSystemApp {
    public static void main(String[] args) throws InterruptedException {
        // Create a bank account with an initial balance of 66,000
        BankAccount account = new BankAccount(66000);

        // Create withdrawal tasks for three customers
        WithdrawTask task1 = new WithdrawTask(account, 54000, "Sheetal");
        WithdrawTask task2 = new WithdrawTask(account, 20000, "Mukund");
        WithdrawTask task3 = new WithdrawTask(account, 10000, "Rahul");

        // Create threads for each withdrawal task
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        // Start all threads (customers trying to withdraw money)
        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to complete
        t1.join();
        t2.join();
        t3.join();

        System.out.println("All transactions completed.");
    }
}