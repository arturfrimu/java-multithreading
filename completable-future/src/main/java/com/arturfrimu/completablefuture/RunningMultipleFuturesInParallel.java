package com.arturfrimu.completablefuture;

import com.arturfrimu.completablefuture.utils.MultithreadingUtilis;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class RunningMultipleFuturesInParallel {
    public static void main(String[] args) {
        System.out.println("Start at: " + LocalDateTime.now());
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            MultithreadingUtilis.sleep(2000);
            return "Task 1";
        });
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            MultithreadingUtilis.sleep(2000);
            return "Task 2";
        });
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            MultithreadingUtilis.sleep(2000);
            return "Task 3";
        });

        CompletableFuture<Void> allOf = CompletableFuture.allOf(future1, future2, future3);

        allOf.thenRun(() -> {
            try {
                System.out.println(future1.get());
                System.out.println(future2.get());
                System.out.println(future3.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
        System.out.println("End at: " + LocalDateTime.now());
        MultithreadingUtilis.sleep(3000);
    }
}
