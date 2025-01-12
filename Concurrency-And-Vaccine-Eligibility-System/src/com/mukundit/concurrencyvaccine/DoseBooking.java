package com.mukundit.concurrencyvaccine;

public class DoseBooking {
    private static int availableDoses = 50; // Total vaccine doses available

    // Synchronized method to book a dose
    public synchronized boolean bookDose() {
        if (availableDoses > 0) {
            availableDoses--;
            return true; // Dose booked successfully
        }
        return false; // No doses available
    }
}