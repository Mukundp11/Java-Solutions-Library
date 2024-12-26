package com.mukund.geometryandfinance;

/**
 * The ConvertTemperature class provides methods to convert temperatures between Fahrenheit and Celsius.
 */
public class ConvertTemperature {

    // Method to convert Fahrenheit to Celsius
    public static float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static float celsiusToFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

