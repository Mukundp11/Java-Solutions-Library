package com.mukund.transportation.management;

public class CabServiceTester {

    public static void main(String[] args) {
        CabService cabService = new CabService();

        // Create customers
        Customer customer1 = new Customer(101, "Rahul Sharma", "Delhi", "Gurgaon", 10.5, 9876543210L);
        Customer customer2 = new Customer(102, "Priya Singh", "Mumbai", "Thane", 5.2, 8765432109L);

        // Add customers to the system
        cabService.addCustomer(customer1);
        cabService.addCustomer(customer2);

        // Generate and print bills
        System.out.println(cabService.generateBillMessage(customer1));
        System.out.println(cabService.generateBillMessage(customer2));
    }
}