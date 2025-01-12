package com.mukund.orderapp;

/**
 * The Order class represents an order with details such as order ID, item name, and item price.
 */
public class Order {
    private int orderId; // Changed variable name to camelCase
    private String itemName;
    private double itemPrice;

    // Constructor to initialize order details
    public Order(int orderId, String itemName, double itemPrice) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Order [OrderId=" + orderId + ", ItemName=" + itemName + ", ItemPrice=" + itemPrice + "]";
    }
}
