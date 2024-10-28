package com.arturfrimu.completablefuture;

import com.arturfrimu.completablefuture.utils.MultithreadingUtilis;

import java.util.concurrent.CompletableFuture;

public class CombiningMultipleCompletableFutures {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            MultithreadingUtilis.sleep(1000);
            System.out.println("future1");
            return "Hello";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            MultithreadingUtilis.sleep(1000);
            System.out.println("future2");
            return "World";
        });

        CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (result1, result2) -> result1 + " " + result2);

        combinedFuture.thenAccept(System.out::println);

        MultithreadingUtilis.sleep(2000);
    }
}
