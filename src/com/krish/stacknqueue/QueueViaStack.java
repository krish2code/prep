package com.krish.stacknqueue;

import java.util.Stack;

public class QueueViaStack {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        queue.queue(1);
        queue.queue(2);
        queue.queue(3);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
    }
}

class Queue<E>
{
    private Stack<E> inbox = new Stack<E>();
    private Stack<E> outbox = new Stack<E>();

    public void queue(E item) {
        inbox.push(item);
    }

    public E dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
               outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }

}
