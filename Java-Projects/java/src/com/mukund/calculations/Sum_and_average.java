package com.mukund.calculations;

/**
 * The Sum_and_average class calculates the sum and average of three numbers.
 */
public class Sum_and_average {

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide three integers as command line arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int sum = num1 + num2 + num3;
        float average = sum / 3.0f; // Use 3.0f to ensure floating-point division

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
