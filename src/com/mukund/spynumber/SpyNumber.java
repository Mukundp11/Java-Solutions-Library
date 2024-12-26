package com.mukund.spynumber;


/**
 * The SpyNumber class provides a method to check if a given number is a spy number.
 */
public class SpyNumber {

    /**
     * Checks if the given number is a spy number.
     *
     * @param num The number to check.
     * @return true if the number is a spy number, false otherwise.
     */
    public static boolean isSpyNumber(int num) {
        int sum = 0;
        int product = 1;

        // Process each digit of the number
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            sum += digit;          // Add to sum
            product *= digit;      // Multiply to product
            num /= 10;             // Remove the last digit
        }

        // Print the sum and product for debugging purposes
        System.out.println("Sum of digits: " + sum);
        System.out.println("Product of digits: " + product);

        // A spy number has equal sum and product of its digits
        return sum == product;
    }
}
