package com.mukundit;

public class CustomThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("CustomThreadDemo started.");

        // Create threads with different limits
        NumberPrinterThread thread1 = new NumberPrinterThread(5);
        NumberPrinterThread thread2 = new NumberPrinterThread(10);
        NumberPrinterThread thread3 = new NumberPrinterThread(15);

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to complete
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("CustomThreadDemo ended.");
    }
}