package com.krish.thread;

public class DeadLockTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    firstThread();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    secondThread();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

    }
    
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void firstThread() throws InterruptedException {
        synchronized (lock1) {
            System.out.println("Thread 1 has aquired lock 1");
            Thread.sleep(10);
            System.out.println("Thread 1 is waiting to aquired lock 2");
            synchronized (lock2) {
                System.out.println("Thread 1 has aquired lock 2");
            }
        }
    }

    public static void secondThread() throws InterruptedException {
        synchronized (lock2) {
            System.out.println("Thread 2 has aquired lock 2");
            Thread.sleep(10);
            System.out.println("Thread 2 is waiting to aquired lock 1");
            synchronized (lock1) {
                System.out.println("Thread 2 has aquired lock 1");
            }
        }
    }

}
