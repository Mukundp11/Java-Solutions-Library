package com.mukundit.concurrencyvaccine;

public class CoronaVaccineApp {
    public static void main(String[] args) {
        // Create vaccine eligibility and dose booking systems
        VaccineEligibility eligibility = new VaccineEligibility(20, false);
        DoseBooking doseBooking = new DoseBooking();

        // Create users
        User user1 = new User("Ravi", 25, false);
        User user2 = new User("Rahul", 16, true);
        User user3 = new User("Virat", 30, false);

        // Check eligibility and book doses
        user1.checkEligibilityAndBookDose(eligibility, doseBooking);
        user2.checkEligibilityAndBookDose(eligibility, doseBooking);
        user3.checkEligibilityAndBookDose(eligibility, doseBooking);
    }
}