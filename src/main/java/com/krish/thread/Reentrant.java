package com.krish.thread;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 
 * Reentrant lock works as Synchronized where lock and unlock can be done a Thread 
 * 
 * USE:
 * use it when you actually need something it provides that synchronized doesn't, like timed lock waits, 
 * interruptible lock waits, non-block-structured locks, multiple condition variables, or lock polling. 
 * 
 * ReentrantLock also has scalability benefits, and you should use it if you actually have a situation that 
 * exhibits high contention, but remember that the vast majority of synchronized blocks hardly ever exhibit 
 * any contention, let alone high contention. 
 * 
 * I would advise developing with synchronization until synchronization has proven to be inadequate, rather 
 * than simply assuming "the performance will be better" if you use ReentrantLock. 
 * 
 * 
 * The constructor for this class accepts an optional fairness parameter. When set true, under contention, 
 * locks favor granting access to the longest-waiting thread. Otherwise this lock does not guarantee any particular 
 * access order. 
 * Programs using fair locks accessed by many threads may display lower overall throughput (i.e., are slower; often much slower) 
 * than those using the default setting, but have smaller variances in times to obtain locks and guarantee lack of starvation. 
 * 
 * Note however, that fairness of locks does not guarantee fairness of thread scheduling. Thus, one of many threads using a 
 * fair lock may obtain it multiple times in succession while other active threads are not progressing and not currently 
 * holding the lock. Also note that the un-timed tryLock method does not honor the fairness setting. It will succeed if the 
 * lock is available even if other threads are waiting.
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