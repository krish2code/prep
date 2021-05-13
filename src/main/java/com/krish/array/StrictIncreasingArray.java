package com.krish.array;

public class StrictIncreasingArray {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 15, 40, 50};
        //System.out.println(count(arr));
        System.out.println(countNew(arr));
    }

    private static int countNew(int[] arr) {

        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[j-1] < arr[j]) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    private static int count(int[] arr) {
        int cnt = 0;
        int len = 1;
        int n = arr.length;

        for (int i = 0; i < n - 1; ++i) {
            if (arr[i + 1] > arr[i]) {
                len++;
            } else {
                cnt = cnt + (len * (len - 1) / 2);
                len = 1;
            }
        }

        if (len > 1) {
            cnt = cnt + (len * (len - 1) / 2);
        }
        return cnt;
    }

}
