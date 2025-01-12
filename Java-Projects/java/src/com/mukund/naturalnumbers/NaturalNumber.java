package com.mukund.naturalnumbers;

/**
 * The NaturalNumber class contains methods for generating natural numbers 
 * between two given numbers.
 */
public class NaturalNumber {

    /**
     * Recursively generates a string of natural numbers between num1 and num2.
     *
     * @param num1 The starting number.
     * @param num2 The ending number.
     * @return A string representing the natural numbers or an error code.
     */
    public static String getNaturalNumber(int num1, int num2) {
        StringBuilder result = new StringBuilder(); // Use StringBuilder for efficient string concatenation
        
        if (num1 < 0 || num2 < 0) {
            return "-1"; // Error code for negative input
        } else if (num1 == 0 || num2 == 0) {
            return "-2"; // Error code for zero input
        } else if (num1 <= num2) {
            // Append current number to the result
            result.append(num1).append(" ");
            // Recursive call to get the next number
            result.append(getNaturalNumber(++num1, num2));
        }

        return result.toString().trim(); // Convert StringBuilder to String and trim any trailing spaces
    }
}

