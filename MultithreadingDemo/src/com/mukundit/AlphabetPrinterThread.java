package com.mukundit;

public class AlphabetPrinterThread extends Thread {
    private final char start;
    private final char end;

    public AlphabetPrinterThread(char start, char end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (char c = start; c <= end; c++) {
            System.out.println(threadName + " is printing: " + c);
        }
    }
}