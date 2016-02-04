package com.krish.other;

import java.util.Random;

public class Array {

    int[] arr = new int[50];
    int arraySize = 10;

    private void generateRandomNumber() {
        for (int i = 0; i < arraySize; i++) {
            arr[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public void printArr() {
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(arr[i] + " |");
            System.out.println("----------");
        }
    }

    public void bubbleSort() {

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("  ");
        System.out.println(" ======= ");
        
        for (int i = arraySize - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    swapValue(j, j+1);
                }
            }
        }
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private void swapValue(int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Array arr = new Array();
        arr.generateRandomNumber();
        arr.bubbleSort();
        // arr.printArr();
    }
}
