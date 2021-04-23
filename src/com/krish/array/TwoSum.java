package com.krish.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int[] indices = toSum(arr, target);
        for (int i=0; i < indices.length; i++) {
            System.out.println(indices[i]);
        }
    }

    private static int[] toSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {

            int remaining = target - nums[i];
            if(map.containsKey(remaining)) {
                indices[0] = map.get(remaining);
                indices[1] = i;

            } else{
                map.put(nums[i], i);
            }
        }
        return indices;
    }
}
