package com.mukund.numberpatterns;

/**
 * The TestNumber class serves as an entry point to test the NumberP class.
 */
public class TestNumber {

    public static void main(String[] args) {
        // Generate and print the number pattern for the given input
        String result = NumberPattern.generateNumberPattern(5);
        System.out.println(result);
    }
}
