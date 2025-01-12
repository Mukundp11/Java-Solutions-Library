package com.mukund.calculations;

/**
 * The Interchange_value class swaps two integer values.
 */
public class Interchange_value {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two integers as command line arguments.");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Interchanging values without using a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Interchanged Values: " + a + " " + b);
    }
}
