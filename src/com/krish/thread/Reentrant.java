package com.krish.thread;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 
 * Reentrant lock works as Synchronized keyword where  
 * lock and unlock can be done a Thread 
 * 
 */

public class Reentrant {

    public static void main(String[] args) throws InterruptedException {

        final Helper help = new Helper();

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    help.firstThread();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    help.secondThread();
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

        help.finished();

    }
}

class Helper {

    private int count = 0;

    private Lock lock = new ReentrantLock();
    private Condition cond = lock.newCondition();

    private void incr() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public void firstThread() throws InterruptedException {

        lock.lock();

        System.out.println("Waiting....");

        cond.await(); // same as wait() in synchronized block

        System.out.println("Woken Up.");

        try {
            incr();
            System.out.println("counting done in first : " + count);
        } finally {
            lock.unlock();
        }
    }

    @SuppressWarnings("resource")
    public void secondThread() throws InterruptedException {
        Thread.sleep(2000);

        lock.lock();

        System.out.println("Press return key");
        new Scanner(System.in).nextLine();
        System.out.println("Got return key");

        cond.signal(); // same as notify() in synchronized block

        try {
            incr();
            System.out.println("counting done in second : " + count);
        } finally {
            lock.unlock();
        }
    }

    public void finished() {
        System.out.println("finished counting : " + count);
    }
}