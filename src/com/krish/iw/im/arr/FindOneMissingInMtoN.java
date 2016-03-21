package com.krish.iw.im.arr;

public class FindOneMissingInMtoN {

    public static void main(String[] args) {
        int[] arr = { -2, 0, 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(findMissing(arr, 0, arr.length - 1));
    }

    private static int findMissing(int[] arr, int start, int end) {

        if (start == end || arr[end] - arr[start] == end)
            return Integer.MIN_VALUE;

        int mid = start + (end - start) / 2;

        if (arr[mid] + 1 != arr[mid + 1]) {
            return arr[mid] + 1;
        }

        if (arr[mid] != arr[mid - 1] + 1) {
            return arr[mid] - 1;
        }

        if (arr[mid] > arr[start] + (mid - start)) {
            return findMissing(arr, start, mid);
        } else if (arr[end] > arr[mid] + (end - mid)) {
            return findMissing(arr, mid + 1, end);
        } else {
            return arr[end] - 1;
        }
    }

}
