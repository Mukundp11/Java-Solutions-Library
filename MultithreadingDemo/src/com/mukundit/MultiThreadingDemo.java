package com.mukundit;

public class MultiThreadingDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started.");

        // Create and start NumberPrinterThreads
        NumberPrinterThread thread1 = new NumberPrinterThread(10);
        NumberPrinterThread thread2 = new NumberPrinterThread(15);
        thread1.start();
        thread2.start();

        // Wait for thread1 and thread2 to complete
        thread1.join();
        thread2.join();

        // Create and start AlphabetPrinterThreads
        AlphabetPrinterThread thread3 = new AlphabetPrinterThread('A', 'J');
        AlphabetPrinterThread thread4 = new AlphabetPrinterThread('K', 'T');
        AlphabetPrinterThread thread5 = new AlphabetPrinterThread('U', 'Z');
        thread3.start();
        thread4.start();
        thread5.start();

        // Wait for thread3, thread4, and thread5 to complete
        thread3.join();
        thread4.join();
        thread5.join();

        System.out.println("Main thread ended.");
    }
}