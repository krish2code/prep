package com.krish.iw;

public class FIndMissing {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(findMissing(arr, 0, arr.length - 1));
    }

    private static int findMissing(int[] arr, int start, int end) {

        if (start == end || arr.length == arr[end])
            return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] + 1 != arr[mid + 1])
            return arr[mid] + 1;

        if (arr[mid] > arr[start] + mid) {
            return findMissing(arr, start, mid);
        } else if (arr[end] > arr[mid] + mid + 1) {
            return findMissing(arr, mid + 1, end);
        } else {
            return arr[start] + 1;
        }
    }
}
