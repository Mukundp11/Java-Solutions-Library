package com.mukundit;

import java.util.HashSet;

/**
 * This class demonstrates the usage of HashSet in Java.
 * HashSet is a collection that does not allow duplicate elements.
 */
public class DemoHashset {

    /**
     * Main method to demonstrate HashSet operations.
     *
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Create a HashSet to store Integer values
        HashSet<Integer> numberSet = new HashSet<>();

        // Add elements to the HashSet
        numberSet.add(83);
        numberSet.add(45);
        numberSet.add(83); // Duplicate element, will not be added
        numberSet.add(55);

        // Print the size of the HashSet
        System.out.println("Size of the HashSet: " + numberSet.size());
    }
}