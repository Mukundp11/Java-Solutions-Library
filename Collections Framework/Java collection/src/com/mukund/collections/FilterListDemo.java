package com.mukund.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates how to filter elements from a list based on a condition.
 * It removes elements that end with the digit '9'.
 */
public class FilterListDemo {

    public static void main(String[] args) {
        // Create lists of integers
        List<Integer> list1 = List.of(1, 2, 9);
        List<Integer> list2 = List.of(9, 19, 29, 3);
        List<Integer> list3 = List.of(1, 2, 3);

        // Filter and print the lists
        System.out.println("Filtered List 1: " + filterList(list1));
        System.out.println("Filtered List 2: " + filterList(list2));
        System.out.println("Filtered List 3: " + filterList(list3));
    }

    /**
     * Filters out elements from the list that end with the digit '9'.
     *
     * @param nums The list of integers to filter.
     * @return A new list containing elements that do not end with '9'.
     */
    static List<Integer> filterList(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (num % 10 != 9) {
                result.add(num);
            }
        }
        return result;
    }
}