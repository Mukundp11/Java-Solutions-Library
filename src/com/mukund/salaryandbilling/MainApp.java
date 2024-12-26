package com.mukund.salaryandbilling;

/**
 * The MainApp class serves as an entry point to test the salary and bill generation functionalities.
 */
public class MainApp {

    public static void main(String[] args) {
        // Salary Calculation
        if (args.length < 1) {
            System.out.println("Please provide the basic salary as a command line argument.");
            return;
        }

        int basicSalary = Integer.parseInt(args[0]);
        BasicSalary salaryCalculator = new BasicSalary(basicSalary);
        int totalSalary = salaryCalculator.calculateTotalSalary();
        System.out.println("Total Salary: " + totalSalary);

        // Bill Generation Calculation
        BillGeneration billGenerator = new BillGeneration();
        int finalBill = billGenerator.calculateFinalBill(4, 3); // Example quantities
        System.out.println("Final Bill: " + finalBill);
    }
}
