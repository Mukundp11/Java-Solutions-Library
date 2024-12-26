package com.mukund.arrayoperations;

import java.util.Arrays;

/**
 * The UniqueElements class provides a method to find and display unique elements in an array.
 */
public class UniqueElements {

    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 5};

        int[] uniqueArr = findUniqueElements(arr);
        System.out.println("Unique elements in the array: " + Arrays.toString(uniqueArr));
    }

    /**
     * Finds unique elements in the given array.
     *
     * @param arr The input array.
     * @return An array containing unique elements.
     */
    public static int[] findUniqueElements(int[] arr) {
        int n = arr.length;
        int uniqueCount = 0;

        // Array to track duplicates
        boolean[] isDuplicate = new boolean[n];

        // Identify duplicates
        for (int i = 0; i < n; i++) {
            if (!isDuplicate[i]) {
                uniqueCount++;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        isDuplicate[j] = true;
                    }
                }
            }
        }

        // Create an array for unique elements
        int[] uniqueArr = new int[uniqueCount];
        int index = 0;

        // Populate the unique elements array
        for (int i = 0; i < n; i++) {
            if (!isDuplicate[i]) {
                uniqueArr[index++] = arr[i];
            }
        }
        
        return uniqueArr;
    }
}
