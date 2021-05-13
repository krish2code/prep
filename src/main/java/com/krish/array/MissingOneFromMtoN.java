package com.krish.array;

public class MissingOneFromMtoN {

    public static void main(String[] args) {

        int[] arr = { -2, -1, 0, 1, 2, 3, 4, 6, 7 };
        System.out.println(find(arr, 0, arr.length - 1));
    }

    private static int find(int[] arr, int start, int end) {

        if (arr == null || arr.length == 0 || start == end || arr[end] - arr[start] == end)
            return Integer.MIN_VALUE;

        int mid = start + (end - start) / 2;

        if (arr[mid] + 1 != arr[mid + 1])
            return arr[mid] + 1; // 1,2,4,5

        if (arr[mid] - 1 != arr[mid - 1])
            return arr[mid] -1; // 1,3,4,5

        if (arr[mid] > arr[start] + (mid - start)) {
            return find(arr, start, mid); // 1,3,4,5,6,7
        } else if (arr[end] > arr[mid] + (end - mid)) {
            return find(arr, mid, end); // 1,2,3,4,6,7
        } else {
            return arr[end] - 1;
        }
    }
}
