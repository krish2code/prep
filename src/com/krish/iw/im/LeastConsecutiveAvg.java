package com.krish.iw.im;

public class LeastConsecutiveAvg {

    public static void main(String[] args) {
        int[] arr = { 3, 7, 90, 20, 10, 50, 40 };
        int count = 3;

        leastAvg(arr, count);
    }

    private static void leastAvg(int[] arr, int k) {

        int sum = 0;
        int minSum = 0;
        int res_index = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        minSum = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];

            if (sum < minSum) {
                minSum = sum;
                res_index = (i - k + 1);
            }
        }

        System.out.println(res_index + " " + (res_index + k - 1));

    }
}
