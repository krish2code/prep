package com.krish.string;

import java.util.Stack;

public class LongestValidSubstring {

    public static void main(String[] args) {
        String str = "((())))()";
        System.out.println(count(str));
    }

    private static int count(String str) {
        char[] arr = str.toCharArray();
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] =='(') {
                stack.push(i);
            } else {
                if(!stack.isEmpty()) {
                    stack.pop();
                    result++;    
                }
            }
        }
        return 2*result ;
    }
}
