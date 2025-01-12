package com.mukund.numberoperations;

import java.util.Scanner;

/**
 * The TableOfNumber class prints the multiplication table of a given number.
 */
public class TableOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
        sc.close(); // Close the scanner resource
    }
}
