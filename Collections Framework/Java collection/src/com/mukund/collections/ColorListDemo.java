package com.mukund.collections;

import java.util.ArrayList;

/**
 * This class demonstrates the usage of ArrayList in Java.
 * ArrayList is a resizable array implementation of the List interface.
 */
public class ColorListDemo {

    /**
     * Main method to demonstrate ArrayList operations.
     *
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Create an ArrayList to store String values
        ArrayList<String> colors = new ArrayList<>();

        // Add elements to the ArrayList
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        // Print the ArrayList
        System.out.println("Elements in the ArrayList: " + colors);
    }
}