package com.mukund.carapp;

/**
 * The Car class represents a car with attributes such as brand, model, year, and driver.
 */
public class Car {
    private String brand;   // Brand of the car
    private String model;   // Model of the car
    private int year;       // Year of manufacture
    private Driver driver;  // Driver associated with the car

    // Constructor to initialize car details
    public Car(String brand, String model, int year, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.driver = driver;
    }

    // Copy constructor for creating a new Car object from an existing one
    public Car(Car c) {
        this.brand = c.brand;
        this.model = c.model;
        this.year = c.year;
        this.driver = c.driver; // Assuming shallow copy is sufficient for Driver
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    // Method to change the driver of the car
    public void changeDriver(Driver newDriver) {
        this.driver = newDriver;
        System.out.println("Driver changed to: " + newDriver.getName());
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", driver=" + driver + "]";
    }
}
