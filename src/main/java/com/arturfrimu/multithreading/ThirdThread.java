package com.arturfrimu.multithreading;

public class ThirdThread implements Runnable {
    private final String threadName;

    public ThirdThread(String threadName) {
        this.threadName = threadName;
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(threadName + i);

        }
    }
}