package com.mukundit.bookmyshow;

public class BookMyShowApp {
    public static void main(String[] args) throws InterruptedException {
        // Create tasks for booking tickets and securing seats
        MovieBookingTask ticketBookingTask = new MovieBookingTask("Ticket booked", "Kedarnath");
        MovieBookingTask seatSecuringTask = new MovieBookingTask("Secured Seat", "Kedarnath");

        // Create threads for each task
        Thread t1 = new Thread(ticketBookingTask);
        Thread t2 = new Thread(seatSecuringTask);

        // Start the first thread (ticket booking)
        t1.start();
        t1.join(); // Wait for t1 to complete before starting t2

        // Start the second thread (seat securing)
        t2.start();
        t2.join(); // Wait for t2 to complete

        System.out.println("All bookings and seat securing completed.");
    }
}