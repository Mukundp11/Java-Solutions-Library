package com.mukund.mobileinfo;

/**
 * The MobileTest class serves as an entry point to test the Mobile class.
 */
public class MobileTest {

    public static void main(String[] args) {
        // Create a new Mobile object with specified properties
        Mobile mobile = new Mobile("Apple", "Grey", 50000);

        // Display the mobile's specifications
        mobile.displaySpecifications();
    }
}
