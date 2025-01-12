package com.mukundit.railwayreservation;

public class ReservationTask implements Runnable {
    private RailwayReservation reservation; // The railway reservation system
    private String passengerName; // Name of the passenger

    // Constructor to initialize the task
    public ReservationTask(RailwayReservation reservation, String passengerName) {
        this.reservation = reservation;
        this.passengerName = passengerName;
    }

    @Override
    public void run() {
        reservation.bookSeats(passengerName); // Book seats for the passenger
    }
}