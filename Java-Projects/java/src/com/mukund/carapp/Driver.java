package com.mukund.carapp;

/**
 * The Driver class represents a driver with a name and age.
 */
public class Driver {
    private String name; // Name of the driver
    private int age;     // Age of the driver

    // Constructor to initialize driver details
    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver [name=" + name + ", age=" + age + "]";
    }
}
