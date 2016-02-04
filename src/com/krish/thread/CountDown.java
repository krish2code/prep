package com.krish.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor1 implements Runnable {
    CountDownLatch latch;

    public Processor1(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        System.out.println("started.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown();
        }

    }
}

public class CountDown {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(6);
        ExecutorService ex = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 6; i++) {
            ex.submit(new Processor1(latch));
        }

        ex.shutdown();
        try {
            ex.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("completed.");
    }
}
