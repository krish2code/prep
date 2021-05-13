package com.krish.array;

public class AlmostSortedArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 60, 40, 50, 30 };
        swap(arr);
    }

    private static void swap(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length) {
                if (arr[i] > arr[i + 1]) {
                    for (int j = arr.length - 1; j > i; j--) {
                        if (arr[j] < arr[j - 1]) {
                            int temp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = temp;
                            break;
                        }
                    }
                }
            }
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}





