package com.mukund.geometryandfinance;

/**
 * The CompoundInterest class provides methods to calculate compound interest.
 */
public class CompoundInterest {

    // Method to calculate compound interest
    public static float calculateCompoundInterest(float rate, int principal, int years) {
        return principal * (float) Math.pow((1 + (rate / 100)), years);
    }
}
