package com.krish.iw.im;

import java.util.Stack;

public class PostFix {

    public static void main(String[] args) {
        String str = "3,5,4,*,+";
        System.out.println(postFix(str));
    }

    private static int postFix(String str) {
        String[] arr = str.split(",");

        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (arr[i].equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else {
                stack.push(Integer.parseInt(arr[i]));
            }
        }
        return stack.pop();
    }
}
