package com.mukund.calculations;

/**
 * The Area_of_Rectangle class calculates the area of a rectangle.
 */
public class Area_of_Rectangle {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide length and breadth as command line arguments.");
            return;
        }
        
        int length = Integer.parseInt(args[0]);
        int breadth = Integer.parseInt(args[1]);
        int areaOfRectangle = length * breadth;
        System.out.println("Area of Rectangle: " + areaOfRectangle);
    }
}
