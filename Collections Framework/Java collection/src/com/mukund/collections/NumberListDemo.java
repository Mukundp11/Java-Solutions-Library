package com.mukund.collections;

import java.util.ArrayList;

/**
 * This class demonstrates the usage of ArrayList in Java.
 * It shows how to add elements to an ArrayList and insert elements at specific positions.
 */
public class NumberListDemo {

    /**
     * Main method to demonstrate ArrayList operations.
     *
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Create an ArrayList to store Integer values
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(12);
        numbers.add(14);

        // Print the ArrayList
        System.out.println("Elements in the ArrayList: " + numbers);

        // Insert an element at the beginning of the ArrayList
        System.out.println("After insertion:");
        numbers.add(0, 67);

        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + numbers);
    }
}