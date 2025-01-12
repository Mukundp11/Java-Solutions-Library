package com.mukund.salaryandbilling;

/**
 * The BasicSalary class handles salary calculations based on basic salary.
 */
public class BasicSalary {

    private int basicSalary;

    // Constructor to initialize basic salary
    public BasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Method to calculate total salary
    public int calculateTotalSalary() {
        int hra = (basicSalary * 15) / 100;          // Housing Rent Allowance
        int conAllow = (basicSalary * 15) / 100;     // Conveyance Allowance
        int enterAllow = (basicSalary * 10) / 100;   // Entertainment Allowance
        return basicSalary + hra + conAllow + enterAllow;
    }
}
