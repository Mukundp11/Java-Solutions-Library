package com.mukund.calculations;

/**
 * The Calculate_tax class calculates the tax based on income.
 */
public class Calculate_tax {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide income as a command line argument.");
            return;
        }

        int income = Integer.parseInt(args[0]);
        float taxRate = (float) (income * (4.9 / 100));
        System.out.println("Tax Rate: " + taxRate);
    }
}
