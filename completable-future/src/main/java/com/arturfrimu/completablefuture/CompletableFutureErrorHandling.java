package com.arturfrimu.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureErrorHandling {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            if (true) {
                throw new RuntimeException("Something went wrong!");
            }
            return "Result";
        }).exceptionally(ex -> {
            System.out.println("Error: " + ex.getMessage());
            return "Default Result";
        });

        future.thenAccept(System.out::println);
    }
}
