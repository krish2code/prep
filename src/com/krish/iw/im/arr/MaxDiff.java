package com.krish.iw.im.arr;

public class MaxDiff {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 10, 4, 7 };
        System.out.println(maxDiff(arr));
    }

    private static int maxDiff(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
        
        int maxDiff = Integer.MIN_VALUE;
        int maxRight = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxRight)
                maxRight = arr[i];
            else {
                if ((maxRight - arr[i]) > maxDiff) {
                    maxDiff = (maxRight - arr[i]);
                }
            }
        }

        return maxDiff;
    }
}
