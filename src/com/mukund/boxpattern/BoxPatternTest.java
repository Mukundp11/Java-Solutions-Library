package com.mukund.boxpattern;

/**
 * The BoxPatternTest class serves as an entry point to test the BoxPattern class.
 */
public class BoxPatternTest {

    public static void main(String[] args) {
        // Define the number of rows and columns for the box pattern
        int rows = 5;   // Example: 5 rows
        int columns = 10; // Example: 10 columns

        // Generate and print the box pattern
        String result = BoxPattern.createBoxPattern(rows, columns);
        System.out.println(result);
    }
}
