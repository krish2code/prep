package com.krish.impl;

import java.util.ArrayList;
import java.util.Stack;

public class QueueViaStack {

    public static void main(String[] args) {
        QueueNew<Integer> queue = new QueueNew<Integer>();
        queue.queue(1);
        queue.queue(2);
        queue.queue(3);
        
        System.out.println(queue.dequeue());
        queue.queue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}

class QueueNew<T>
{
    private Stack<T> inbox = new Stack<T>();
    private Stack<T> outbox = new Stack<T>();

    public void queue(T item) {
        inbox.push(item);
    }

    public T dequeue2() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
               outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }

    public T dequeue() {
        if(inbox.isEmpty()) {
            T value = inbox.pop();
            dequeue();
            inbox.push(value);
        }
        return inbox.pop();
    }

}
