package com.mukundit.concurrencyvaccine;

public class TicketDispenser implements Runnable {
    private static int totalTickets = 100; // Total tickets available
    private int allottedSeat = 1; // Tracks the next seat to allot

    // Synchronized method to ensure thread-safe seat allotment
    public synchronized int allotSeatNumber() {
        if (allottedSeat > totalTickets) {
            return -1; // No more seats available
        }
        return allottedSeat++;
    }

    @Override
    public void run() {
        int seatNumber = allotSeatNumber();
        if (seatNumber == -1) {
            System.out.println(Thread.currentThread().getName() + ": No more seats available.");
        } else {
            System.out.println(Thread.currentThread().getName() + " allotted seat: " + seatNumber);
        }
    }
}