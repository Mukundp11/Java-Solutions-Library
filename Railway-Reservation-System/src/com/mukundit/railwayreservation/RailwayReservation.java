package com.mukundit.railwayreservation;

public class RailwayReservation {
    private int availableSeats; // Total available seats
    private int wantedSeats; // Number of seats requested by a passenger

    // Constructor to initialize available seats and wanted seats
    public RailwayReservation(int availableSeats, int wantedSeats) {
        this.availableSeats = availableSeats;
        this.wantedSeats = wantedSeats;
    }

    // Synchronized method to book seats
    public synchronized void bookSeats(String passengerName) {
        System.out.println(passengerName + " is trying to book " + wantedSeats + " seat(s).");

        if (availableSeats >= wantedSeats) {
            System.out.println(wantedSeats + " seat(s) booked for " + passengerName);
            availableSeats -= wantedSeats; // Deduct the booked seats from available seats
            System.out.println("Remaining seats available for booking: " + availableSeats);
        } else {
            System.out.println("Tickets are unavailable for " + passengerName + ". Please visit again.");
        }
    }
}