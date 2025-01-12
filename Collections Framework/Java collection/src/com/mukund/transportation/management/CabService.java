package com.mukund.transportation.management;

import java.util.ArrayList;
import java.util.List;

public class CabService {

    private List<Customer> customers = new ArrayList<>();

    // Add a new customer to the system
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Check if the customer is a first-time user
    public boolean isFirstTimeCustomer(Customer customer) {
        for (Customer existingCustomer : customers) {
            if (existingCustomer.getPhoneNumber() == customer.getPhoneNumber()) {
                return false; // Not a first-time customer
            }
        }
        return true; // First-time customer
    }

    // Calculate the bill based on distance and customer type
    public double calculateBill(Customer customer) {
        if (isFirstTimeCustomer(customer)) {
            return 0; // Free ride for first-time customers
        }

        double baseFare = 80; // Base fare for the first 4 km
        double additionalFarePerKm = 6; // Additional fare per km beyond 4 km

        if (customer.getDistance() <= 4) {
            return baseFare;
        } else {
            return baseFare + (customer.getDistance() - 4) * additionalFarePerKm;
        }
    }

    // Generate a bill message for the customer
    public String generateBillMessage(Customer customer) {
        double billAmount = calculateBill(customer);
        return customer.getCustomerName() + ", please pay your bill of Rs. " + billAmount;
    }
}