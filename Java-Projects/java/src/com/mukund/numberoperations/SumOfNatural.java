package com.mukund.numberoperations;

import java.util.Scanner;

/**
 * The SumOfNatural class calculates the sum of natural numbers up to a given number.
 */
public class SumOfNatural {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Calculate the sum of natural numbers using the formula n*(n+1)/2
        int sum = num * (num + 1) / 2;
        
        System.out.println("The sum of natural numbers up to " + num + " is: " + sum);
        sc.close(); // Close the scanner resource
    }
}
