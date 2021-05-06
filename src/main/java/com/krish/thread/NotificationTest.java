package com.krish.thread;

public class NotificationTest {
    private volatile boolean go = false;

    public static void main(String args[]) throws InterruptedException {
        final NotificationTest test = new NotificationTest();

        Runnable waitTask = new Runnable() {
            @Override
            public void run() {
                try {
                    test.waitNow();
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                System.out.println(Thread.currentThread() + " finished Execution in waitNow");
            }
        };

        Runnable notifyTask = new Runnable() {

            @Override
            public void run() {
                test.notifyNow();
                System.out.println(Thread.currentThread() + " finished Execution in notifyNow");
            }
        };

        Thread t1 = new Thread(waitTask, "WT--1"); // will wait
        Thread t2 = new Thread(waitTask, "WT--2"); // will wait
        Thread t3 = new Thread(waitTask, "WT--3"); // will wait
        Thread t4 = new Thread(notifyTask, "WT--4"); // will notify

        // starting all waiting thread
        t1.start();
        t2.start();
        t3.start();

        // pause to ensure all waiting thread started successfully
        Thread.sleep(200);

        // starting notifying thread
        t4.start();

    }

    /*
     * wait and notify can only be called from synchronized method or bock
     */
    private synchronized void waitNow() throws InterruptedException {
        System.out.println(Thread.currentThread() + " is going to wait on this object");
        wait(); // release lock and re-acquires on wake-up
        System.out.println(Thread.currentThread() + " is woken up");
        // go = false; // resetting condition
    }

    /*
     * both shouldGo() and go() are locked on current object referenced by "this" keyword
     */
    private synchronized void notifyNow() {
        System.out.println(Thread.currentThread() + " is going to notify all or one thread waiting on this object");
        go = true; // making condition true for waiting thread
        // notify(); // only one out of three waiting thread WT1, WT2,WT3 will woke up
        notifyAll(); // all waiting thread WT1, WT2,WT3 will woke up
    }
}
