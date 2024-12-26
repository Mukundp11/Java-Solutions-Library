package com.mukund.financialcalculations;


/**
 * The MainApp class serves as an entry point to test the utility classes.
 */
public class MainApp {

    public static void main(String[] args) {
        
        // Cycle Selling Price Calculation
        if (args.length >= 5) {
            int oldCycle = Integer.parseInt(args[0]);
            int repair = Integer.parseInt(args[1]);
            int color = Integer.parseInt(args[2]);
            int newAccess = Integer.parseInt(args[3]);
            int expectedProfit = Integer.parseInt(args[4]);

            int sellingPrice = CycleSellingPrice.calculateSellingPrice(oldCycle, repair, color, newAccess, expectedProfit);
            System.out.println("Selling Price of Cycle: " + sellingPrice);
        } else {
            System.out.println("Please provide old cycle price, repair cost, color cost, new accessories cost and expected profit.");
        }

        // Number of Years Months Days Calculation
        if (args.length >= 6) {
            int days = Integer.parseInt(args[5]);
            int[] result = NumberOfYearsMonthsDays.convertDays(days);
            System.out.println("No of Years: " + result[0]);
            System.out.println("No of Months: " + result[1]);
            System.out.println("Weeks: " + result[2]);
            System.out.println("Days: " + result[3]);
        } else {
            System.out.println("Please provide the number of days.");
        }

        // Shopkeeper Calculation
        if (args.length >= 8) {
            double tvSetPrice = Double.parseDouble(args[6]);
            float profitPercentage = Float.parseFloat(args[7]) / 100; // Convert percentage to decimal

            double[] shopkeeperResults = ShopkeeperCalculation.calculateSellingPrice(tvSetPrice, profitPercentage);
            System.out.printf("Selling Price: %.2f%n", shopkeeperResults[0]);
            System.out.printf("Profit: %.2f%n", shopkeeperResults[1]);
            System.out.printf("VAT: %.2f%n", shopkeeperResults[2]);
            System.out.printf("Service Charge: %.2f%n", shopkeeperResults[3]);
            System.out.printf("Total Selling Price: %.2f%n", shopkeeperResults[4]);
        } else {
            System.out.println("Please provide TV set price and profit percentage.");
        }

        // Simple Interest Calculation
        if (args.length >= 11) {
            int principal = Integer.parseInt(args[8]);
            float rate = Float.parseFloat(args[9]);
            int timeYears = Integer.parseInt(args[10]);

            double[] interestResults = SimpleInterestAndAmount.calculateInterestAndAmount(principal, rate, timeYears);
            System.out.printf("Simple Interest: %.2f%n", interestResults[0]);
            System.out.printf("Total Amount: %.2f%n", interestResults[1]);
        } else {
            System.out.println("Please provide principal amount, rate of interest and time in years.");
        }
    }
}

