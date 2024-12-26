package com.mukund.personapp;

/**
 * The PersonElc class serves as an entry point to test the Person class.
 */
public class PersonDetails {

    public static void main(String[] args) {
        // Create Person objects with sample data
        Person p = new Person("Ravi", 45);
        Person p1 = new Person("Virat", 40);

        // Introduce each person
        p.introduce();
        p1.introduce();
    }
}
