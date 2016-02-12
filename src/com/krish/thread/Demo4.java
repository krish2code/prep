package com.krish.thread;

public class Demo4 {

    public static void main(String[] args) throws InterruptedException {

        final Demo4 dm = new Demo4();

        Runnable waitTask = new Runnable() {
            public void run() {
                try {
                    dm.waitNow();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        Runnable notifyTask = new Runnable() {
            public void run() {
                dm.notifyNow();
            }
        };

        Thread t1 = new Thread(waitTask, "worker1");
        Thread t2 = new Thread(waitTask, "worker2");
        Thread t3 = new Thread(notifyTask, "worker3");

        t1.start();
        t2.start();
        Thread.sleep(2000);
        t3.start();

    }

    private void waitNow() throws InterruptedException {
        synchronized (this) {
            System.out.println(Thread.currentThread() + " will wait");
            wait();
            System.out.println(Thread.currentThread() + " resume");
        }
    }

    private void notifyNow() {
        synchronized (this) {
            notifyAll();
            System.out.println(Thread.currentThread() + " will notify");
        }
    }
}
