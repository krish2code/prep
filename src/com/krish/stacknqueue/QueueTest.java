package com.krish.stacknqueue;

public class QueueTest {

    Object[] array;
    int head, tail, size = 0;

    public QueueTest(int size) {
        array =  new Object[size];
        
    }
    
    public static void main(String[] args) {
        QueueTest  queue = new QueueTest(4);
        queue.enqueue(2);
    }

    private void enqueue(Object i) {
        if(size < array.length) {
            array[tail] = i;
            tail++;
            size++;
        }
    }

    
}
