package com.mukund.orderapp;

/**
 * The ELC_Ord_Cus class serves as an entry point to test the Customer and Order classes.
 */
public class Main {

    public static void main(String[] args) {
        // Create an Order object
        Order od = new Order(123, "Biryani", 100.0);
        
        // Create a Customer object with the associated order
        Customer c = new Customer(234, "Shyam", "Hyderabad", od);

        // Print customer details along with the associated order
        System.out.println(c);
    }
}
