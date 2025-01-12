package com.mukundit.bookmyshow;

public class MovieBookingTask implements Runnable {
    private String taskName; // Name of the task (e.g., "Ticket booked", "Secured Seat")
    private String movieName; // Name of the movie (e.g., "Kedarnath")

    // Constructor to initialize the task
    public MovieBookingTask(String taskName, String movieName) {
        this.taskName = taskName;
        this.movieName = movieName;
    }

    @Override
    public void run() {
        // Simulate booking or securing seats for the movie
        for (int i = 1; i <= 4; i++) {
            System.out.println(taskName + " for " + movieName + " movie: " + i);
            try {
                Thread.sleep(100); // Simulate a delay in processing
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted.");
                e.printStackTrace();
            }
        }
    }
}