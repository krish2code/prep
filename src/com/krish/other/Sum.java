package com.krish.other;

public class Sum {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,6,7,8,9};
        int sum = (9*10)/2;
        System.out.println(sum);
        int count =0;
        for(int i=0; i<a.length; i++) {
            count = count+ a[i];
        }
        
        System.out.println(sum-count);
    }
}
