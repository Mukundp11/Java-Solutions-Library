package com.mukund.geometry;

/**
 * The Circle class serves as the entry point to test the Area class.
 */
public class Circle {

    public static void main(String[] args) {
        // Test the area calculation with a sample radius
        int radius = 2;
        String result = Area.getArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + result);
    }
}
