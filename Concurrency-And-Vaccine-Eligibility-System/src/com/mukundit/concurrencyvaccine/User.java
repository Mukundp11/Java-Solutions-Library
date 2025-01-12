package com.mukundit.concurrencyvaccine;

public class User {
    private String name;
    private int age;
    private boolean hasHealthCondition;

    public User(String name, int age, boolean hasHealthCondition) {
        this.name = name;
        this.age = age;
        this.hasHealthCondition = hasHealthCondition;
    }

    public void checkEligibilityAndBookDose(VaccineEligibility eligibility, DoseBooking doseBooking) {
        if (eligibility.isEligible()) {
            System.out.println(name + " is eligible for vaccination.");
            if (doseBooking.bookDose()) {
                System.out.println(name + " successfully booked a vaccine dose.");
            } else {
                System.out.println(name + ": No vaccine doses available.");
            }
        } else {
            System.out.println(name + " is not eligible for vaccination.");
        }
    }
}