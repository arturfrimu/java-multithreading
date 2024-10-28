package com.arturfrimu.multithreading.forkjoin;

import java.util.concurrent.RecursiveAction;

public class DivideNumberAction extends RecursiveAction {

    private final Integer THRESHOLD = 1;

    private final Integer value;

    public DivideNumberAction(Integer value) {
        this.value = value;
    }

    @Override
    protected void compute() {
        boolean havingValue = value > THRESHOLD;
        if (havingValue) {
            System.out.println("Halving: " + value);

            DivideNumberAction leftTask = new DivideNumberAction(value / 2);
            DivideNumberAction rightTask = new DivideNumberAction(value / 2);
            invokeAll(leftTask, rightTask);
        } else {
            System.out.println("Halving finished");
            System.out.print("");
        }
    }

    private static void sleep(final int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
