package com.mukund.transportation.management;

public class Customer {

    private int customerId;
    private String customerName;
    private String pickupLocation;
    private String dropLocation;
    private double distance; // Distance in kilometers (now using double for precision)
    private long phoneNumber; // Phone number as a long for better representation

    public Customer(int customerId, String customerName, String pickupLocation, String dropLocation, double distance,
                    long phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.distance = distance;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", pickupLocation="
                + pickupLocation + ", dropLocation=" + dropLocation + ", distance=" + distance + ", phoneNumber="
                + phoneNumber + "]";
    }
}