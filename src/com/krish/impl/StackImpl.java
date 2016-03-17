package com.krish.impl;

import java.util.NoSuchElementException;

public class StackImpl {

    public static void main(String[] args) {
        Stack stack = new Stack(4);

        System.out.println(stack.isEmpty());
        stack.push("A");
        stack.push("B");
        stack.push("S");
        stack.push("D");
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}

class Stack {
    Object[] array;
    int size = 0;
    int topOfStack;

    public Stack(int size) {
        array = new Object[size];
        topOfStack = -1;
    }

    public void push(Object item) {
        if (array.length == size) {
            throw new StackOverflowError();
        }
        topOfStack++;
        array[topOfStack] = item;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return array[topOfStack];
    }

    public Object pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Object item = array[topOfStack];
        array[topOfStack] = null;
        size--;
        topOfStack--;
        return item;
    }
    
    public int size() {
        return size;
    }
}