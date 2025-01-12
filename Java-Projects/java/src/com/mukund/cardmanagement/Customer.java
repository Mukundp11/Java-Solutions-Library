package com.mukund.cardmanagement;

/**
 * The Customer class represents a customer with a name and credit points.
 */
public class Customer {
    private String customerName; // The name of the customer
    private int creditPoints;     // The credit points of the customer

    // Constructor to initialize customer details
    public Customer(String customerName, int creditPoints) {
        this.customerName = customerName;
        this.creditPoints = creditPoints;
    }

    // Getter for credit points
    public int getCreditPoints() {
        return creditPoints;
    }

    @Override
    public String toString() {
        return "Customer [CustomerName=" + customerName + "]";
    }
}
