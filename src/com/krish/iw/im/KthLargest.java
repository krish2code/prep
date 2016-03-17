package com.krish.iw.im;

public class KthLargest {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 4 };
        System.out.println(findKthLargest(arr, 2));
    }

    public static int findKthLargest(int[] nums, int k) {
        if (k < 1 || k > nums.length) {
            return -1;
        }

        return getKth(nums, k, 0, nums.length - 1);
    }

    private static int getKth(int[] nums, int k, int start, int end) {
        int pivot = start;
        int left = start;
        int right = end;

        while (left <= right) {
            while (left <= right && nums[left] <= nums[pivot]) {
                ++left;
            }

            while (left <= right && nums[right] >= nums[pivot]) {
                --right;
            }
            if (left < right) {
                swap(nums, left, right);
            }
        }
        
        swap(nums, pivot, right);

        if (k == right + 1) {
            return nums[right];
        } else if (k > right + 1) {
            return getKth(nums, k, right + 1, end);
        } else {
            return getKth(nums, k, start, right-1);
        }
    }

    public static void swap(int[] nums, int n1, int n2) {
        int tmp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = tmp;
    }
}
