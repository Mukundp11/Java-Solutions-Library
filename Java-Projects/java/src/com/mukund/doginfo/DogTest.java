package com.mukund.doginfo;

/**
 * The DogTest class serves as an entry point to test the Dog class.
 */
public class DogTest {

    public static void main(String[] args) {
        // Create a new Dog object with specified properties
        Dog d = new Dog("Tom", 2.0, 2); // Name, height (in meters), age (in years)

        // Display the dog's information
        d.getDogInformation();
        
        // Simulate the dog barking
        d.bark();
    }
}
