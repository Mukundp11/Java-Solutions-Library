package com.mukund.calculations;

/**
 * The Cube_of_number class calculates the cube of a given number.
 */
public class Cube_of_number {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        int val1 = Integer.parseInt(args[0]);
        int cube = val1 * val1 * val1;
        System.out.println("Cube: " + cube);
    }
}
