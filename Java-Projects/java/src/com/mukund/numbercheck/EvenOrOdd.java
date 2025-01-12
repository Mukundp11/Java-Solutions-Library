package com.mukund.numbercheck;

/**
 * The EvenOrOdd class provides methods to check if a given integer is even or odd.
 */
public class EvenOrOdd {

    /**
     * Checks if the given integer is even.
     *
     * @param a The integer to check.
     * @return true if the number is even, false if it is odd.
     */
    public boolean isEven(int a) {
        return a % 2 == 0; // Return true if even, false if odd
    }
}
