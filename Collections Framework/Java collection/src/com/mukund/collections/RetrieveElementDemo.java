package com.mukund.collections;

import java.util.ArrayList;

/**
 * This class demonstrates how to retrieve an element from an ArrayList at a specific index.
 */
public class RetrieveElementDemo {

    public static void main(String[] args) {
        // Create an ArrayList to store elements
        ArrayList<Object> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add(0, "rahul");
        list.add("ravi");
        list.add(1, "virat");
        list.add("sunny");

        // Print the ArrayList
        System.out.println("ArrayList: " + list);

        // Retrieve an element at a specific index
        int index = 2;
        if (index >= 0 && index < list.size()) {
            System.out.println("Element at index " + index + ": " + list.get(index));
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }
}