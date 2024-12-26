package com.mukund.conversions;

/**
 * The SumOfDigit class provides a method to calculate the sum of digits of a given integer.
 */
public class SumOfDigit {

    // Method to calculate the sum of digits of a number
    public static int calculateSum(int number) {
        int tensPlace = number / 10; // Get the tens place
        int unitsPlace = number % 10; // Get the units place
        return tensPlace + unitsPlace; // Return the sum of digits
    }
}

