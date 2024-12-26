package com.mukund.financialcalculations;

/**
 * The ShopkeeperCalculation class calculates selling price, profit, VAT, service charge,
 * and total selling price for a TV set.
 */
public class ShopkeeperCalculation {

    // Method to calculate selling price and related costs
    public static double[] calculateSellingPrice(double tvSetPrice, float profitPercentage) {
        double profit = tvSetPrice * profitPercentage;
        double sellingPrice = tvSetPrice + profit;
        double vat = 0.127 * sellingPrice; // VAT of 12.7%
        double serviceCharge = 0.0387 * sellingPrice; // Service charge of 3.87%
        double totalSelling = sellingPrice + vat + serviceCharge;

        return new double[]{sellingPrice, profit, vat, serviceCharge, totalSelling};
    }
}
