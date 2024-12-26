package com.mukund.boxpattern;

/**
 * The BoxPattern class provides a method to create a box pattern of asterisks.
 */
public class BoxPattern {

    /**
     * Creates a box pattern of asterisks based on the given number of rows and columns.
     *
     * @param r The number of rows.
     * @param c The number of columns.
     * @return A string representing the box pattern.
     */
    public static String createBoxPattern(int r, int c) {
        StringBuilder pattern = new StringBuilder();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                pattern.append("* "); // Append an asterisk followed by a space
            }
            pattern.append("\n"); // Move to the next line after each row
        }

        return pattern.toString(); // Convert StringBuilder to String
    }
}
