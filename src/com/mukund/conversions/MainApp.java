package com.mukund.conversions;

/**
 * The MainApp class serves as an entry point to test the conversion and digit sum functionalities.
 */
public class MainApp {

    public static void main(String[] args) {
        // Fahrenheit to Celsius conversion
        double fahrenheit = 98;
        double celsius = FahrenheitToCelsius.convert(fahrenheit);
        System.out.println("Celsius: " + celsius);

        // Sum of digits calculation
        int number = 54;
        int sum = SumOfDigit.calculateSum(number);
        System.out.println("Sum of digits: " + sum);
    }
}
