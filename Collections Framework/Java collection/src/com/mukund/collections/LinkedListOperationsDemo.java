package com.mukund.collections;

import java.util.LinkedList;

public class LinkedListOperationsDemo {

    public static void main(String[] args) {
        // Create a LinkedList to store colors
        LinkedList<String> colors = new LinkedList<>();

        // Adding elements to the LinkedList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the initial list of colors
        System.out.println("Initial List of Colors:");
        System.out.println(colors);

        // Update an element at a specific index
        System.out.println("\nAfter Updating Element at Index 2:");
        colors.set(2, "Orange"); // Replace "Blue" with "Orange"
        System.out.println(colors);

        // Remove an element at a specific index
        System.out.println("\nAfter Removing Element at Index 3:");
        colors.remove(3); // Remove "Yellow"
        System.out.println(colors);

        // Add a new element at the beginning of the list
        System.out.println("\nAfter Adding 'Pink' at the Beginning:");
        colors.addFirst("Pink");
        System.out.println(colors);

        // Add a new element at the end of the list
        System.out.println("\nAfter Adding 'Black' at the End:");
        colors.addLast("Black");
        System.out.println(colors);

        // Retrieve the first and last elements
        System.out.println("\nFirst Color in the List: " + colors.getFirst());
        System.out.println("Last Color in the List: " + colors.getLast());
    }
}