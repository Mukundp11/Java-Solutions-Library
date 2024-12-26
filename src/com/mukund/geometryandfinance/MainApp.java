package com.mukund.geometryandfinance;


/**
 * The MainApp class serves as an entry point to test the utility classes.
 */
public class MainApp {

    public static void main(String[] args) {
        // Check for sufficient arguments for Compound Interest calculation
        if (args.length >= 3) {
            float rate = Float.parseFloat(args[0]);
            int principal = Integer.parseInt(args[1]);
            int years = Integer.parseInt(args[2]);
            float compoundInterest = CompoundInterest.calculateCompoundInterest(rate, principal, years);
            System.out.println("Compound Interest: " + compoundInterest);
        } else {
            System.out.println("Please provide rate, principal amount, and number of years.");
        }

        // Check for sufficient arguments for temperature conversion
        if (args.length >= 4) {
            float fahrenheit = Float.parseFloat(args[3]);
            float celsius = Float.parseFloat(args[4]);
            System.out.println("Celsius: " + ConvertTemperature.fahrenheitToCelsius(fahrenheit));
            System.out.println("Fahrenheit: " + ConvertTemperature.celsiusToFahrenheit(celsius));
        } else {
            System.out.println("Please provide temperatures in Fahrenheit and Celsius.");
        }

        // Check for sufficient arguments for Surface Area of Cube calculation
        if (args.length >= 5) {
            int side = Integer.parseInt(args[5]);
            int surfaceAreaOfCube = SurfaceAreaOfCube.calculateSurfaceArea(side);
            System.out.println("Surface Area of Cube: " + surfaceAreaOfCube);
        } else {
            System.out.println("Please provide the side length of the cube.");
        }

        // Check for sufficient arguments for Total Surface Area of Cylinder calculation
        if (args.length >= 7) {
            float radius = Float.parseFloat(args[6]);
            float height = Float.parseFloat(args[7]);
            float totalSurfaceArea = TotalSurfaceAreaOfCylinder.calculateTotalSurfaceArea(radius, height);
            System.out.println("Total Surface Area of Cylinder: " + totalSurfaceArea);
        } else {
            System.out.println("Please provide radius and height of the cylinder.");
        }
    }
}
