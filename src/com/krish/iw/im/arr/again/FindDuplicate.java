package com.krish.iw.im.arr.again;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 5, 6, 7 };
        System.out.println(find(arr, 0, arr.length - 1));
    }

    private static int find(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == arr[mid - 1] || arr[mid] == arr[mid + 1])
            return arr[mid];

        if (arr[mid] < arr[start] + (mid - start))
            return find(arr, start, mid); // -2,-1,-1,0,1,2,3 0<-2+3-0
        else if (arr[end] < arr[mid] + (end - mid))
            return find(arr, mid, end);
        else
            return arr[mid] + 1;
    }
}
