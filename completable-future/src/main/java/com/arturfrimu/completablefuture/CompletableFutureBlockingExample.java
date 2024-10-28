package com.arturfrimu.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureBlockingExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Start");
            try {
                Thread.sleep(2000);
                System.out.println("Done");
            } catch (InterruptedException e) {
                System.out.println("Start ERROR");
                throw new IllegalStateException(e);
            }
            return "Result from async task";
        });

        System.out.println("Block and wait for the future to complete");
        String result = future.get();
        System.out.println("Code after blocking");
        System.out.println(result);
    }
}
