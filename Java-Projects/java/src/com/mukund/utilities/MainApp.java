package com.mukund.utilities;

/**
 * The MainApp class serves as an entry point to test the utility classes.
 */
public class MainApp {

    public static void main(String[] args) {
        // Check for sufficient arguments for StringToDouble
        if (args.length >= 2) {
            double multiplicationResult = StringToDouble.multiply(args[0], args[1]);
            System.out.println("Multiplication of two numbers: " + multiplicationResult);
        } else {
            System.out.println("Please provide two numbers as command line arguments for multiplication.");
        }

        // Check for sufficient arguments for ProfitLoss
        if (args.length >= 4) {
            int sp = Integer.parseInt(args[2]);
            int cp = Integer.parseInt(args[3]);
            ProfitLoss.calculateProfitLoss(sp, cp);
        } else {
            System.out.println("Please provide selling price and cost price as command line arguments.");
        }

        // Check for sufficient arguments for AsciiValue
        if (args.length >= 5) {
            char alp = args[4].charAt(0);
            int asciiValue = AsciiValue.getAsciiValue(alp);
            System.out.println("ASCII value of '" + alp + "': " + asciiValue);
        } else {
            System.out.println("Please provide a character as a command line argument for ASCII value.");
        }
    }
}

