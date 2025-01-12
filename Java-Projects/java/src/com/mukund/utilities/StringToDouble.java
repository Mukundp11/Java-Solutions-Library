package com.mukund.utilities;

/**
 * The StringToDouble class provides a method to multiply two numbers given as strings.
 */
public class StringToDouble {

    // Method to multiply two strings representing numbers
    public static double multiply(String str1, String str2) {
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);
        return num1 * num2;
    }
}
