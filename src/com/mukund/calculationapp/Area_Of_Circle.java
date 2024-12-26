package com.mukund.calculationapp;

/**
 * The Area_Of_Circle class calculates the area of a circle based on its radius.
 */
public class Area_Of_Circle {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the radius as a command line argument.");
            return;
        }

        float radius = Float.parseFloat(args[0]); // Read radius from command line
        float area = (float) (Math.PI * radius * radius); // Calculate area
        System.out.println("Area of Circle with radius " + radius + ": " + area);
    }
}
