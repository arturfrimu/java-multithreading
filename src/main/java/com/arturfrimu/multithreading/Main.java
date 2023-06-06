package com.arturfrimu.multithreading;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new FirstThread();
        firstThread.setName("Thread 1 : ");
        Thread secondThread = new SecondThread();
        secondThread.setName("Thread 2 : ");
        Thread runnableThread = new Thread(new ThirdThread("Thread 3 : "));
        Thread runnableThread2 = new Thread(() -> System.out.println("Hello"));

        firstThread.start();
        secondThread.start();
        runnableThread.start();
        runnableThread2.start();
    }
}
