package com.mukund.utilities;

/**
 * The ProfitLoss class provides methods to calculate profit or loss based on selling price and cost price.
 */
public class ProfitLoss {

    // Method to calculate profit or loss
    public static void calculateProfitLoss(int sp, int cp) {
        if (sp > cp) {
            int profit = sp - cp;
            float profitPercent = ((float) profit / cp) * 100; // Corrected calculation of profit percentage
            System.out.println("Profit: " + profit);
            System.out.println("Profit Percentage: " + profitPercent + "%");
        } else {
            int loss = cp - sp;
            float lossPercent = ((float) loss / cp) * 100; // Corrected calculation of loss percentage
            System.out.println("Loss: " + loss);
            System.out.println("Loss Percentage: " + lossPercent + "%");
        }
    }
}
