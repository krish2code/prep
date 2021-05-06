package com.krish.iw.im;

import java.util.Stack;

public class PreFix {
    public static void main(String[] args) {
        String str = "+,3,*,5,4";
        System.out.println(preFix(str));
    }

    private static int preFix(String str) {

        String[] arr = str.split(",");

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (arr[i].equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else {
                stack.push(Integer.parseInt(arr[i]));
            }
        }

        return stack.pop();
    }

    // private static int preFix(String str) {
    // String[] arr = str.split(",");
    //
    // Stack<String> stack = new Stack<String>();
    //
    // for (String string : arr) {
    // stack.push(string);
    // }
    //
    // Stack<Integer> newStack = new Stack<Integer>();
    //
    // while (!stack.isEmpty()) {
    // if (stack.peek().equals("*")) {
    // stack.pop();
    // newStack.push(newStack.pop() * newStack.pop());
    // } else if (stack.peek().equals("+")) {
    // stack.pop();
    // newStack.push(newStack.pop() + newStack.pop());
    // } else {
    // newStack.push(Integer.parseInt(stack.pop()));
    // }
    // }
    //
    // return newStack.pop();
    // }
}
