package com.krish.iw.im.arr;

public class MonotonicArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,3};
        int[] arr2 = {4,4,2,4};
        int[] arr3 = {1,1,1,1,2,1};
        int[] arr4 = {1,1,1,1,1,1};
        int[] arr5 = {1,2,3,4,5,6};
        int[] arr6 = {7,6,5,4};

        System.out.println(checkMonotonic(arr1));
        System.out.println(checkMonotonic(arr2));
        System.out.println(checkMonotonic(arr3));
        System.out.println(checkMonotonic(arr4));
        System.out.println(checkMonotonic(arr5));
        System.out.println(checkMonotonic(arr6));
    }

    private static boolean checkMonotonic(int[] arr) {

        boolean increasing = false;
        boolean decreasing = false;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]) {
                increasing = true;
            }
            else if(arr[i] < arr[i-1]) {
                decreasing = true;
            }
            if(arr[i] == arr[i-1]) {
                continue;
            }
        }

        if (increasing && decreasing)
            return false;
        else if (!increasing && !decreasing)
            return true;
        else
            return increasing || decreasing;


    }
}
