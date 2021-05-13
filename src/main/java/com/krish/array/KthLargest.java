package com.krish.array;

public class KthLargest {
    public static void main(String[] args) {
        int[] nums = {3,4,7,5,6};
        int k = 2;
        int val = kthLargest(nums, nums.length-k+1, 0, nums.length-1);
        System.out.println(val);
    }

    private static int kthLargest(int[] arr, int k, int startIndex, int endIndex) {

        if(arr == null || arr.length == 0) {
            return -1;
        }

        int pivot = arr[endIndex];
        int leftIndex = startIndex;
        int rightIndex = endIndex;

        while (true) {
            while(arr[leftIndex] < pivot && leftIndex < rightIndex) {
                leftIndex++;
            }

            while(arr[rightIndex] >= pivot && leftIndex < rightIndex) {
                rightIndex--;
            }

            if (leftIndex == rightIndex) {
                break;
            }
            swap(arr, leftIndex, rightIndex);
        }

        swap(arr, leftIndex, endIndex);

        if(k == leftIndex+1) {
            return pivot;
        } else if (k < leftIndex+1){
            return kthLargest(arr, k, startIndex, leftIndex-1);
        } else {
            return kthLargest(arr, k, leftIndex+1, endIndex);
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
