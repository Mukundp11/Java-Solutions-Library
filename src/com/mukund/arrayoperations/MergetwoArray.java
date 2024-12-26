package com.mukund.arrayoperations;

import java.util.Scanner;

/**
 * The MergetwoArray class provides a method to merge two arrays of integers.
 * It prompts the user to input the elements of both arrays and merges them
 * into a single array in sorted order.
 */
public class MergetwoArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for the number of elements in the first array
        System.out.println("Input the number of elements to be stored in the first array:");
        int n = sc.nextInt();
        
        // Initialize arrays
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] mergedArray = new int[2 * n];
        
        // Input elements for the first array
        System.out.println("Input " + n + " elements in the first array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            arr1[i] = sc.nextInt();
        }

        // Input elements for the second array
        System.out.println("Input the number of elements to be stored in the second array:");
        int m = sc.nextInt();
        
        // Ensure both arrays have the same size
        if (m != n) {
            System.out.println("Both arrays must have the same size.");
            sc.close();
            return;
        }
        
        System.out.println("Input " + m + " elements in the second array:");
        for (int i = 0; i < m; i++) {
            System.out.print("Element " + i + ": ");
            arr2[i] = sc.nextInt();
        }

        // Merge both arrays
        int i = 0, j = 0, k = 0;
        
        while (i < n && j < m) {
            if (arr1[i] >= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        
        // Add remaining elements from arr1 if any
        while (i < n) {
            mergedArray[k++] = arr1[i++];
        }
        
        // Add remaining elements from arr2 if any
        while (j < m) {
            mergedArray[k++] = arr2[j++];
        }

        // Output the merged array
        System.out.println("Merged Array:");
        for (int x : mergedArray) {
            System.out.print(x + " ");
        }
        
        // Close the scanner
        sc.close();
    }
}
