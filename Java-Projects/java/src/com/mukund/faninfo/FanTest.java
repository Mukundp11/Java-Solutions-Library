package com.mukund.faninfo;

/**
 * The FanTest class serves as an entry point to test the Fan class.
 */
public class FanTest {

    public static void main(String[] args) {
        // Create a new Fan object with specified properties
        Fan fan = new Fan("Usha", "Copper", 3);

        // Switch on the fan and display its information
        fan.switchOn();
        
        // Switch off the fan
        fan.switchOff();
    }
}
