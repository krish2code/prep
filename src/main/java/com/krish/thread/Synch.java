package com.krish.thread;

public class Synch {

    int count;

    public static void main(String[] args) {
        Synch sy = new Synch();
        sy.doWork();
    }

    synchronized void incr() {
        count++;
    }
    
    private void doWork() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    incr(); 
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    incr(); 
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(count);
    }

}
