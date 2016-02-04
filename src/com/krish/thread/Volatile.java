package com.krish.thread;

import java.util.Scanner;

class VolatileDemo extends Thread{
    
    //volatile : prevent variable from caching
    private volatile boolean running = true;
    
    public void run() {
        while(running) {
            
                System.out.println("hello");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
    
    public void shutdown() {
        running = false;
    }
    
}

public class Volatile {

    public static void main(String[] args) {
        VolatileDemo t1 = new VolatileDemo();
        t1.start();
        
        System.out.println("hit any key to stop....");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        
        t1.shutdown();
    }
}
