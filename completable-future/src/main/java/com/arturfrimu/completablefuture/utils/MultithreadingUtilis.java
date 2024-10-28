package com.arturfrimu.completablefuture.utils;

public class MultithreadingUtilis {
    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
