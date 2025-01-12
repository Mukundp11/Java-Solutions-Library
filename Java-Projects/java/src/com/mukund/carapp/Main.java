package com.mukund.carapp;

/**
 * The ElcMain class serves as an entry point to test the Car and Driver classes.
 */
public class Main {

    public static void main(String[] args) {
        // Create a Driver object
        Driver d = new Driver("Ravi", 40);

        // Create a Car object with the initial driver
        Car c = new Car("BMW", "GL600", 2020, d);
        
        // Print details of the car with its initial driver
        System.out.println(c);

        // Create a copy of the car object using the copy constructor
        Car c1 = new Car(c);
        
        // Change the driver of the copied car object
        c1.changeDriver(new Driver("Raj", 44));
        
        // Print details of both cars to show that only the copied car's driver has changed
        System.out.println("Original Car: " + c);
        System.out.println("Copied Car: " + c1);
    }
}
