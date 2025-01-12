package com.mukund.bowlingstats;

/**
 * The BowlerTest class serves as an entry point to test the Bowler class.
 */
public class BowlerTest {

    public static void main(String[] args) {
        // Create a new Bowler object with sample data
        Bowler b = new Bowler("Sachin", 10, 5, 750, 463);

        // Compute and display bowling statistics
        b.computeBowlingAverage();
        System.out.println("-------------------------------------------");
        b.showStatistics();
        System.out.println("-------------------------------------------");
        b.computeStrikeRate();
    }
}
