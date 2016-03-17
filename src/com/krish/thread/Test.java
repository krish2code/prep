package com.krish.thread;

import java.util.NoSuchElementException;

public class Test {

    public static void main(String[] args) {

        StackNew stack = new StackNew(4);
        stack.push("A");
        stack.push("B");
        stack.push("S");
        stack.push("D");
        
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}

class StackNew {

    Object[] stackArr;
    int size = 0;
    int topOfStack = -1;

    public StackNew(int capcity) {
        stackArr = new Object[capcity];
    }

    public void push(Object item) {
        if (size == stackArr.length) {
            throw new IllegalStateException();
        } else {
            topOfStack++;
            stackArr[topOfStack] = item;
            size++;
        }
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public Object peek() {
        if (isEmpty())
            throw new NoSuchElementException();
        return stackArr[topOfStack];
    }

    public Object pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            Object item = stackArr[topOfStack];
            stackArr[topOfStack] = null;
            topOfStack--;
            size--;
            return item;
        }

    }
}
