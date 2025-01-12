package com.mukund.calculationapp;

/**
 * The Addition class calculates the sum of two integers.
 */
public class Addition {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two integers as command line arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]); // First number
        int num2 = Integer.parseInt(args[1]); // Second number
        int sum = num1 + num2; // Calculate sum
        System.out.println("Sum of " + num1 + " and " + num2 + ": " + sum);
    }
}
