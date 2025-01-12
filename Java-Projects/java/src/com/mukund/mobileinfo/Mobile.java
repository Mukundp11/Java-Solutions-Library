package com.mukund.mobileinfo;

/**
 * The Mobile class represents a mobile phone with properties such as name, color, and price.
 */
public class Mobile {
    // Properties
    private String name;
    private String color;
    private double price;

    // Constructor to initialize mobile properties
    public Mobile(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    // Method to display mobile specifications
    public void displaySpecifications() {
        System.out.println("Mobile belongs to: " + name + 
                           ", Its color is: " + color + 
                           ", Its price is: " + price);
    }
}
