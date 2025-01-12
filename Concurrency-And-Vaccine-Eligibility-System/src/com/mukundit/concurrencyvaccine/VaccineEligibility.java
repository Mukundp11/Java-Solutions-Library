package com.mukundit.concurrencyvaccine;

public class VaccineEligibility {
    private int age;
    private boolean hasHealthCondition;

    public VaccineEligibility(int age, boolean hasHealthCondition) {
        this.age = age;
        this.hasHealthCondition = hasHealthCondition;
    }

    public boolean isEligible() {
        // Eligibility criteria: Age >= 18 or has a health condition
        return age >= 18 || hasHealthCondition;
    }
}