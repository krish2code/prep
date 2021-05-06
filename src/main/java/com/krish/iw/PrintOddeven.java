package com.krish.iw;

public class PrintOddeven {

    Object lock = new Object();

    public static void main(String[] args) {
        final PrintOddeven pr = new PrintOddeven();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                pr.odd();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                pr.even();
            }
        });

        t1.start();
        t2.start();
    }

    protected void odd() {
        synchronized (this) {
            for (int i = 1; i < 100; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    notifyAll();
                }
            }
        }

    }

    protected void even() {

        synchronized (this) {
            for (int i = 1; i < 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    notifyAll();
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    
                }
            }
        }
    }
}
