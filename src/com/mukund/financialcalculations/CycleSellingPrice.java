package com.mukund.financialcalculations;

/**
 * The CycleSellingPrice class calculates the selling price of a cycle.
 */
public class CycleSellingPrice {

    // Method to calculate selling price
    public static int calculateSellingPrice(int oldCycle, int repair, int color, int newAccess, int expectedProfit) {
        int costPrice = oldCycle + repair + color + newAccess;
        return costPrice + expectedProfit;
    }
}
