package com.mukund.financialcalculations;

/**
 * The NumberOfYearsMonthsDays class provides methods to convert days into years, months, weeks, and days.
 */
public class NumberOfYearsMonthsDays {

    // Method to convert days into years, months, weeks, and remaining days
    public static int[] convertDays(int totalDays) {
        int years = totalDays / 365;
        totalDays %= 365;
        int months = totalDays / 30;
        totalDays %= 30;
        int weeks = totalDays / 7;
        int days = totalDays % 7;

        return new int[]{years, months, weeks, days};
    }
}
