package com.krish.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {
    int id;

    public Processor(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("starting : " + id);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }

        System.out.println("completed : " + id);
    }
}

public class TPools {

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            ex.submit(new Processor(i));
        }
        ex.shutdown();

        System.out.println("All task submitted.");

        try {
            ex.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("All task completed.");
    }
}

