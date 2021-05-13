package com.krish.array;

import java.util.Arrays;

public class FIndPairOfSum {

    static int count;

    public static void main(String[] args) throws Exception {
        int[] arr = { 1, 2, 3, 4, 5, 6 , 7};
        find(arr, 2);
        System.out.println(count);
    }

    private static void find(int[] arr, int k) throws Exception {
        if (arr == null || arr.length == 0)
            throw new Exception();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            search(arr, arr[i] + k, 0, arr.length);
        }
    }

    private static void search(int[] arr, int k, int start, int end) {
        if(end > start) {
            int mid = start + (end - start) / 2;
            
            if(arr[mid] > k)
                search(arr, k, start, mid);
            else if (arr[mid] < k)
                search(arr, k, mid+1, end);
            else 
                count++;
        }
    }
}
