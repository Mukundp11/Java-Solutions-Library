package com.mukund.orderapp;

/**
 * The Customer class represents a customer with details such as ID, name, address, and associated order.
 */
public class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private Order order;

    // Constructor to initialize customer details
    public Customer(int customerId, String customerName, String customerAddress, Order order) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Customer [CustomerId=" + customerId + ", CustomerName=" + customerName + 
               ", CustomerAddress=" + customerAddress + ", Order=" + order + "]";
    }
}
