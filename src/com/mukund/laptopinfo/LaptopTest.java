package com.mukund.laptopinfo;

/**
 * The LaptopTest class serves as an entry point to test the Laptop class.
 */
public class LaptopTest {

    public static void main(String[] args) {
        // Create a new Laptop object with specified properties
        Laptop laptop = new Laptop("Dell", 40000, "Black");

        // Display the laptop's details
        laptop.displayDetails();
    }
}
