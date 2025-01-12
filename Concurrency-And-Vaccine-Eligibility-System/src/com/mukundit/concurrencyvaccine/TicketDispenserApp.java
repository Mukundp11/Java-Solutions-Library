package com.mukundit.concurrencyvaccine;

public class TicketDispenserApp {
    public static void main(String[] args) throws InterruptedException {
        TicketDispenser ticketDispenser = new TicketDispenser();

        // Create and start 102 threads to simulate seat booking
        for (int i = 0; i < 102; i++) {
            Thread thread = new Thread(ticketDispenser, "Thread-" + (i + 1));
            thread.start();
            thread.join(); // Ensure threads run sequentially for demonstration
        }
    }
}