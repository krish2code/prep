package com.krish.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 10, 6, 7, 8, 9, 1, 2, 1 };
        bubbleSort(arr);
        for (int i : arr) {
           System.out.print(i + " "); 
        }
    }

    private static void bubbleSort(int[] arr) {
        for(int j = arr.length-1; j>1 ; j--)
        for (int i = 0; i < j; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}
