package com.mukund.doginfo;

/**
 * The Dog class represents a dog with properties such as name, height, and age.
 */
public class Dog {
    // Properties
    private String name;
    private double height;
    private int age;

    // Constructor to initialize dog properties
    public Dog(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    // Method to display dog information
    public void getDogInformation() {
        System.out.println("Dog name is: " + name + 
                           ", Its height is: " + height + 
                           ", Its age is: " + age);
    }

    // Method to simulate barking behavior
    public void bark() {
        System.out.println(name + " started barking!");
    }
}
