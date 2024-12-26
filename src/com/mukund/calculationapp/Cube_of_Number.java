package com.mukund.calculationapp;

/**
 * The Cube_of_Number class calculates the cube of a given integer.
 */
public class Cube_of_Number {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide an integer as a command line argument.");
            return;
        }

        int val1 = Integer.parseInt(args[0]);
        int cube = val1 * val1 * val1; // Calculate the cube
        System.out.println("Cube of " + val1 + ": " + cube);
    }
}
