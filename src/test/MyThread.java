package test;

public class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<10 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt, "hiTh");
        t1.start();
        Thread t2 = new Thread(mt, "hiTh");
        t2.start();
    }
}
