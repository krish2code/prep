package com.krish.sorting;

public class Sort {

    public static void main(String[] args) {
        int[] arr = { 6, 5, 3, 1, 8, 7, 2, 4 };
        Sort bs = new Sort();
//
//        System.out.println("Bubble Sorted");
//        arr = bs.bubbleSort(arr);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println("\n");
//        int[] arr1 = { 7, 6, 4, 2, 9, 8, 3, 5 };
//        System.out.println("Selection Sorted");
//        arr1 = bs.selectionSort(arr1);
//        for (int i : arr1) {
//            System.out.print(i + " ");
//        }
        
        System.out.println("\n");
//        int[] arr2 = { 7, 6, 4, 2, 9, 8, 3, 5 };
        int[] arr2 = { 7, 6, 4, 1};
        System.out.println("Insertion Sorted");
        arr2 = bs.insertionSort(arr2);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }

    private int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int toInsert = arr[i];

            while ((j > 0) && arr[j - 1] > toInsert) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = toInsert;
            
            for (int in : arr) {
                System.out.print(in + " ");
            }
            System.out.println("");
        }

        return arr;
    }

    /*
     * Goes front to back Worst case performance О(n2) Best case performance О(n2) Average case performance О(n2)
     */
    private int[] selectionSort(int[] arr) {

        for (int y = 0; y < arr.length; y++) {
            int minIndex = y;

            for (int x = y; x < arr.length; x++) {
                if (arr[x] < arr[minIndex]) {
                    minIndex = x;
                }
            }
            swap(arr, y, minIndex);
        }

        return arr;
    }

    /*
     * Goes back to front Worst case performance O(n^2) Best case performance O(n) Average case performance O(n^2)
     */
    private int[] bubbleSort(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (int j = arr.length - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }

        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
