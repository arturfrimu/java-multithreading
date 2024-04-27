package com.arturfrimu.multithreading.collections;

import java.util.concurrent.BlockingQueue;

public class ReadFromQueueWorker implements Runnable {

    private final BlockingQueue<Integer> queue;

    public ReadFromQueueWorker(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int counter = queue.take();
                System.out.println("Take: " + counter + "\t Size: " + queue.size());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
