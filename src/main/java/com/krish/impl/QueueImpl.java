package com.krish.impl;

import java.util.NoSuchElementException;

public class QueueImpl {

    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}

class Queue {

    Object[] array;
    int size, head, tail = 0;
    
    public Queue(int size) {
        array = new Object[size];
    }
    
    public void enqueue(Object item) {
        if(array.length == size) {
            throw new IllegalStateException();
        }
        array[tail++] = item;
        size++;
    }

    public Object dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        
        Object item = array[head];
        array[head] = null;
        size--;
        head++;
        return item;
    }
    
    public Object peek() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return array[head];
    }
    
    public boolean isEmpty() {
        return size ==0;
    }
}