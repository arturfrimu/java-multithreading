package com.arturfrimu.completablefuture;

import com.arturfrimu.completablefuture.utils.MultithreadingUtilis;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureNonBlockingOperationsAndChaining {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Start");
            MultithreadingUtilis.sleep(2000);
            System.out.println("Done");
            return "Result from async task";
        }).thenApply(result -> result + " World");

        future.thenAccept(System.out::println);
        System.out.println("Code after thenAccept");
        MultithreadingUtilis.sleep(3000);
    }

}
