package com.mukund.conversions;

/**
 * The FahrenheitToCelsius class provides a method to convert Fahrenheit to Celsius.
 */
public class FahrenheitToCelsius {

    // Method to convert Fahrenheit to Celsius
    public static double convert(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
