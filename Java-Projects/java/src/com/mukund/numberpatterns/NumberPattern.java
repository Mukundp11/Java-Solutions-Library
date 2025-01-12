
package com.mukund.numberpatterns;

/**
 * The NumberP class contains methods for generating a specific number pattern.
 */
public class NumberPattern {

    /**
     * Generates a number pattern based on the input number.
     *
     * @param num The input number to generate the pattern.
     * @return A string representing the generated number pattern or an error code.
     */
    public static String generateNumberPattern(int num) {
        StringBuilder pattern = new StringBuilder(); // Use StringBuilder for efficient string concatenation
        
        if (num < 0) {
            return "-1"; // Error code for negative input
        } else if (num == 0) {
            return "0"; // Return "0" for zero input
        } else {
            for (int i = 1; i <= 5; i++) { // Fixed to generate a pattern of 5 rows
                for (int j = 1; j <= i; j++) {
                    pattern.append(j * i).append(" "); // Append the product of j and i
                }
                pattern.append("\n"); // Move to the next line after each row
            }
        }
        
        return pattern.toString(); // Convert StringBuilder to String
    }
}
