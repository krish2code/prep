package com.krish.iw.im.arr;

public class KthLargest {

    public static void main(String[] args) {
        int[] arr = { 8, 7, 4, 5, 9, 6, 1, 2, 19, 12, 3 };
        int k = 1;
        System.out.println(findKthLargest(arr, arr.length - k + 1, 0, arr.length - 1));
    }

    private static int findKthLargest(int[] arr, int k, int start, int end) {

        if (arr == null || arr.length == 0)
            return -1;

        int pivot = arr[end];

        int left = start;
        int right = end;

        while (true) {
            while (arr[left] < pivot && left < right)
                left++;

            while (arr[right] >= pivot && left < right)
                right--;

            if (left == right)
                break;

            swap(arr, left, right);
        }

        swap(arr, left, end);

        if (k == left + 1) {
            return pivot;
        } else if (k < left + 1) {
            return findKthLargest(arr, k, start, left - 1);
        } else {
            return findKthLargest(arr, k, left + 1, end);
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}
