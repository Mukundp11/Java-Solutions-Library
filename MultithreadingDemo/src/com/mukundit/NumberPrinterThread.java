package com.mukundit;

public class NumberPrinterThread extends Thread {
    private final int limit;

    public NumberPrinterThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = 1; i <= limit; i++) {
            System.out.println(threadName + " is printing: " + i);
        }
    }
}