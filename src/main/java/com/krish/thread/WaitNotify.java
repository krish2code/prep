package com.krish.thread;

import java.util.Scanner;

public class WaitNotify {

    /*
     * Wait and Notify can only be called from synchronized block as they need object lock to work and 
     * that lock is provided by synchronized block
     * wait(): hands over of object lock
     * notify(): notify thread which is waiting for the lock. Notify does not hand over the lock
     */
    public static void main(String[] args) throws InterruptedException {

        final Processor2 pr = new Processor2();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    pr.consume();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    pr.produce();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

}

class Processor2 {

    public void consume() throws InterruptedException {
        synchronized (this) {
            System.out.println("producer thread running ....");
            wait();
            System.out.println("producer thread resume ....");
        }

    }

    public void produce() throws InterruptedException {
        Thread.sleep(2000);
        synchronized (this) {
            System.out.println("waiting for hit key");
            new Scanner(System.in).nextLine();
            System.out.println("key has been hit");
            notify();
            
        }
    }
}