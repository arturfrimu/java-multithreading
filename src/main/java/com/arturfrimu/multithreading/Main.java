package com.arturfrimu.multithreading;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new FirstThread();
        Thread secondThread = new SecondThread();
        firstThread.start();
        secondThread.start();
    }
}
