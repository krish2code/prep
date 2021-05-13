package com.krish.array;

public class KthLargest {
    public static void main(String[] args) {
        int[] nums = {3,4,7,5,6};
        int k = 2;
        int val = kthLargest(nums, nums.length-k, 0, nums.length-1);
        System.out.println(val);
    }

    private static int kthLargest(int[] arr, int k, int startIndex, int endIndex) {

        if(arr == null || arr.length == 0) {
            return -1;
        }

        int pivot = arr[endIndex];
        int i = startIndex;
        int j = endIndex;

        while (true) {
            while(arr[i] < pivot && i < j) {
                i++;
            }

            while(arr[j] >= pivot && i < j) {
                j--;
            }

            if (i == j) {
                break;
            }
            swap(arr, i, j);
        }

        swap(arr, i, endIndex);

        if(k == i) {
            return pivot;
        } else if (k < i){
            return kthLargest(arr, k, startIndex, i-1);
        } else {
            return kthLargest(arr, k, i+1, endIndex);
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
