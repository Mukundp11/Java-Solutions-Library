package com.mukund.laptopinfo;

/**
 * The Laptop class represents a laptop with properties such as name, price, and color.
 */
public class Laptop {
    // Properties
    private String name;
    private double price;
    private String color;

    // Constructor to initialize laptop properties
    public Laptop(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    // Method to display Laptop details
    public void displayDetails() {
        System.out.println("My laptop belongs to: " + name + 
                           ", its price is: " + price + 
                           ", and its color is: " + color);
    }
}
