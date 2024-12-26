package com.mukund.salaryandbilling;

/**
 * The BillGeneration class handles bill calculations for items purchased.
 */
public class BillGeneration {

    private int chickenRollsPrice = 60; // Price per chicken roll
    private int vegPuffsPrice = 25;      // Price per veg puff
    private int discount = 50;            // Discount on total bill

    // Method to calculate final bill based on quantities
    public int calculateFinalBill(int chickenRollsQuantity, int vegPuffsQuantity) {
        int chickenRollsBill = chickenRollsPrice * chickenRollsQuantity;
        int vegPuffsBill = vegPuffsPrice * vegPuffsQuantity;
        return chickenRollsBill + vegPuffsBill - discount;
    }
}
