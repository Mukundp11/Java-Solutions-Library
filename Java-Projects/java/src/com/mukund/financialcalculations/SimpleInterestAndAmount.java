package com.mukund.financialcalculations;

/**
 * The SimpleInterestAndAmount class calculates simple interest and total amount based on principal,
 * rate of interest, and time period.
 */
public class SimpleInterestAndAmount {

    // Method to calculate simple interest and total amount
    public static double[] calculateInterestAndAmount(int principal, float rate, int timeYears) {
        double simpleInterest = (principal * rate * timeYears) / 100;
        double amount = simpleInterest + principal;

        return new double[]{simpleInterest, amount};
    }
}
