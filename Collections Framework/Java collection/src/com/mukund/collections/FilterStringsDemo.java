package com.mukund.collections;

import java.util.Arrays;
import java.util.List;

/**
 * This class demonstrates how to filter strings from a list based on a condition.
 * It filters out strings that contain the letter 'z'.
 */
public class FilterStringsDemo {

    public static void main(String[] args) {
        // Create lists of fruit names
        List<String> fruits1 = Arrays.asList("apple", "banana", "grape", "zucchini");
        List<String> fruits2 = Arrays.asList("kiwi", "orange", "pomegranate", "apricot");
        List<String> fruits3 = Arrays.asList("blueberry", "cherry", "raspberry", "blackberry");

        // Filter and print the lists
        System.out.println("Filtered Fruits 1: " + filterStrings(fruits1));
        System.out.println("Filtered Fruits 2: " + filterStrings(fruits2));
        System.out.println("Filtered Fruits 3: " + filterStrings(fruits3));
    }

    /**
     * Filters out strings that contain the letter 'z'.
     *
     * @param strings The list of strings to filter.
     * @return A new list containing strings that do not contain 'z'.
     */
    static List<String> filterStrings(List<String> strings) {
        List<String> result = new java.util.ArrayList<>();
        for (String str : strings) {
            if (!str.toLowerCase().contains("z")) {
                result.add(str);
            }
        }
        return result;
    }
}