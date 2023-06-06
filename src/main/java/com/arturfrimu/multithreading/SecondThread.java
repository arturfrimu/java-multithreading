package com.arturfrimu.multithreading;

public class SecondThread extends Thread {
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(this.getName() + i);
        }
    }
}
