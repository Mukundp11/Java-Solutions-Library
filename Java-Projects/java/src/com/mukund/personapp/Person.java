package com.mukund.personapp;

/**
 * The Person class represents a person with a name and age.
 */
public class Person {
    private String name; // Instance variable for person's name
    private int age;     // Instance variable for person's age

    // Instance initializer block
    {
        System.out.println("Person instance created");
    }

    // Constructor to initialize person details
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to introduce the person
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I'm " + age + " years old.");
    }
}
