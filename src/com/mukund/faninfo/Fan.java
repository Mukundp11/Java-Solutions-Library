package com.mukund.faninfo;

/**
 * The Fan class represents a fan with properties such as name, coil type, and number of wings.
 */
public class Fan {
    // Properties
    private String name;
    private String coil;
    private int wings;

    // Constructor to initialize fan properties
    public Fan(String name, String coil, int wings) {
        this.name = name;
        this.coil = coil;
        this.wings = wings;
    }

    // Method to switch on the fan and display its information
    public void switchOn() {
        System.out.println("The fan is " + name + 
                           ", it has coils made of " + coil + 
                           ", and it has " + wings + " wings.");
    }

    // Method to switch off the fan
    public void switchOff() {
        System.out.println("The fan is switched off.");
    }
}
