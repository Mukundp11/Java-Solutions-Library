package com.mukund.bowlingstats;

/**
 * The Bowler class represents a bowler's statistics in cricket.
 */
public class Bowler {
    // Instance variables
    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;

    // Default constructor
    public Bowler() {
    }

    // Parameterized constructor
    public Bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    // Method to compute bowling average
    public void computeBowlingAverage() {
        if (wickets <= 0) {
            System.err.println("Error: Wickets must be greater than zero to compute average.");
            return;
        }
        double average = (double) runsConceded / wickets; // Use double for accurate division
        System.out.println("Name: " + name);
        System.out.println("Bowling Average: " + average);
    }

    // Method to show bowler statistics
    public void showStatistics() {
        if (wickets < 0 || matches < 0 || ballsBowled < 0 || runsConceded < 0) {
            System.err.println("Error: Statistics cannot be negative.");
            return;
        }
        System.out.println("Name: " + name + 
                           ", Wickets: " + wickets + 
                           ", Matches: " + matches + 
                           ", Balls Bowled: " + ballsBowled + 
                           ", Runs Conceded: " + runsConceded);
    }

    // Method to compute strike rate
    public void computeStrikeRate() {
        if (ballsBowled <= 0) {
            System.err.println("Error: Balls bowled must be greater than zero to compute strike rate.");
            return;
        }
        double strikeRate = (double) runsConceded / ballsBowled * 100; // Strike rate calculation
        System.out.println("Name: " + name);
        System.out.println("Strike Rate: " + strikeRate);
    }
}
