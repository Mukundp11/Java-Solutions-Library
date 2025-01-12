package com.mukund.collections;

import java.util.ArrayList;

/**
 * This class demonstrates how to copy elements from one ArrayList to another.
 */
public class CopyListDemo {

    public static void main(String[] args) {
        // Create the first ArrayList to store Integer values
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("List1: " + list1);

        // Create the second ArrayList to store String values
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        System.out.println("List2: " + list2);

        // Copy elements from list2 to list1
        System.out.println("After copying:");
        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list2.get(i));
        }

        // Print the updated lists
        System.out.println("Updated List1: " + list1);
        System.out.println("List2: " + list2);
    }
}