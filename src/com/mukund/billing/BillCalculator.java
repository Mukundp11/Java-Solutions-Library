package com.mukund.billing;

/**
 * The BillCalculator class provides methods to calculate the final bill after applying discounts.
 */
public class BillCalculator {

    // Method to calculate the final bill after applying discounts
    public static int calculateFinalBill(int bill) {
        int discount;

        if (bill < 5000) {
            discount = (bill * 5) / 100; // 5% discount
        } else if (bill >= 5000 && bill < 10000) {
            discount = (bill * 10) / 100; // 10% discount
        } else { // bill >= 10000
            discount = (bill * 15) / 100; // 15% discount
        }

        return bill - discount; // Return the final bill after discount
    }
}
