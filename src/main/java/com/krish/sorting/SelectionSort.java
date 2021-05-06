package com.krish.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 1, 2, 7, 6, 5, 8, 9 };
        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minimum = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minimum] > arr[j]) {
                    minimum = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
        }
        
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
