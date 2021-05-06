package com.krish.thread;

public class Demo2 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnerImpl());
        Thread t2 = new Thread(new RunnerImpl());

        t1.start();
        t2.start();
    }
}

class RunnerImpl implements Runnable {
    
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
