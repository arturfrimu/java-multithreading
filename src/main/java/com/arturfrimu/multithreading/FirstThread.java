package com.arturfrimu.multithreading;

public class FirstThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(this.getName() + i);
        }
    }
}
