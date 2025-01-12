package com.mukundit.railwayreservation;

public class RailwayReservationApp {
    public static void main(String[] args) throws InterruptedException {
        // Create a railway reservation system with 5 available seats
        RailwayReservation reservation = new RailwayReservation(5, 1);

        // Create tasks for different passengers
        ReservationTask task1 = new ReservationTask(reservation, "X Æ A-12");
        ReservationTask task2 = new ReservationTask(reservation, "Mahi");
        ReservationTask task3 = new ReservationTask(reservation, "Virat");

        // Create threads for each task
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        // Start the first thread (X Æ A-12)
        t1.start();
        t1.join(); // Wait for t1 to complete before starting t2

        // Start the second thread (Mahi)
        t2.start();
        t2.join(); // Wait for t2 to complete before starting t3

        // Start the third thread (Virat)
        t3.start();
        t3.join(); // Wait for t3 to complete

        System.out.println("All seat bookings completed.");
    }
}