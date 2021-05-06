package com.krish.iw;

public class OneRepeated {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7, 6, 7, 8, 9 };
        repeated(arr);
    }

    private static void repeated(int[] arr) {
        int sum = add(arr);
        int maxNum = arr.length - 1;
        int dup = sum - (maxNum * (maxNum + 1) / 2);
        System.out.println(dup);
    }

    private static int add(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum = sum + a;
        }
        return sum;
    }
}
