package com.krish.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] version1 = { 0, 1, 2 };
        int[] version2 = { 0, 0, 0, 0, 0, 0, 0, 1, 2 };
        int[] version3 = { 0, 0, 0, 0, 1, 1, 1, 1, 3 };
        int[] version4 = { 0, 0, 0, 0, 0, 5 };
        int[] version5 = { 0, 1, 1, 1, 1, 6 };
        int[] version6 = { 1, 2 };
        int[] version7 = { 0, 2 };
        int[] version8 = { 1, 1, 1, 1, 1, 1, 2 };
        int[] version9 = { 0, 0, 3 };

        binarySearchRecursive(version1, 1, 0, version1.length - 1);
        binarySearchWhile(version1, 1, 0, version1.length - 1);
        binarySearchRecursive(version2, 1, 0, version2.length - 1);
        binarySearchWhile(version2, 1, 0, version2.length - 1);
        binarySearchRecursive(version3, 1, 0, version3.length - 1);
        binarySearchWhile(version3, 1, 0, version3.length - 1);
        binarySearchRecursive(version4, 1, 0, version4.length - 1);
        binarySearchWhile(version4, 1, 0, version4.length - 1);
        binarySearchRecursive(version5, 1, 0, version5.length - 1);
        binarySearchWhile(version5, 1, 0, version5.length - 1);
        binarySearchRecursive(version6, 1, 0, version6.length - 1);
        binarySearchWhile(version6, 1, 0, version6.length - 1);
        binarySearchRecursive(version7, 1, 0, version7.length - 1);
        binarySearchWhile(version7, 1, 0, version7.length - 1);
        binarySearchRecursive(version8, 1, 0, version8.length - 1);
        binarySearchWhile(version8, 1, 0, version8.length - 1);
        binarySearchRecursive(version9, 1, 0, version9.length - 1);
        binarySearchWhile(version9, 1, 0, version9.length - 1);
    }

    private static void binarySearchRecursive(int[] arr, int key, int min, int max) {
        if (max < min) {
            System.out.println("not found");
        } else {
            int index = midPoint(min, max);
            if (arr.length > index) {
                if (arr[index] > key) {
                    binarySearchRecursive(arr, 1, min, index - 1);
                } else if (arr[index] < key) {
                    binarySearchRecursive(arr, 1, index + 1, max);
                } else if (arr[index] == key) {
                    if (index - 1 >= 0 && arr[index - 1] == key)
                        binarySearchRecursive(arr, 1, min, index - 1);
                    else
                        System.out.println("index " + index);
                }
            }
        }

    }
    
    private static void binarySearchWhile(int[] arr, int key, int min, int max) {
        while (min <= max) {
            int mid = max + min / 2;
            if (arr[mid] > key) {
                max = mid - 1;
            } else if (arr[mid] > key) {
                min = mid + 1;
            } else {
                System.out.println("binarySearchWhile : found at index " + mid);
                min = max + 1;
            }
        }
    }


    private static int midPoint(int min, int max) {
        return min + ((max - min) / 2);
    }
}
