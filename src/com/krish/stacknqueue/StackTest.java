package com.krish.stacknqueue;

public class StackTest {

    public static void main(String[] args) {
        MyStack stack = new MyStack(4);
        
        
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        stack.push("A");
        System.out.println(stack.pop());
        stack.push("B");
        System.out.println(stack.peek());
        stack.push("S");
        System.out.println(stack.peek());
        stack.push("D");
        System.out.println(stack.peek());
        stack.push("E");
        System.out.println(stack.peek());
        System.out.println(stack.empty());
    }
}

class MyStack {
    private String[] stackArray;
    private int topIndex;
    private int stackSize;

    public MyStack(int stackSize) {
        this.stackSize = stackSize;
        topIndex = -1;
        stackArray = new String[stackSize];
    }

    public boolean empty() {
        return (topIndex < 0);
    }

    public void push(String str) {
        if (topIndex+1 < stackSize) {
            topIndex++;
            stackArray[topIndex] = str;
        } else {
            System.out.println("StackOverflow for value : " + str);
        }
    }

    public String peek() {
        return (topIndex > -1) ? stackArray[topIndex] : null;
    }

    public String pop() {
        if (!this.empty()) {
            String temp = this.peek();
            stackArray[topIndex] = null;
            topIndex--;
            return temp;
        } else {
            return null;
        }
    }
}
