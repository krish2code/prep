package com.krish.array;

public class FindEvenDigitNumbers {

    public static void main(String[] args) {
        int[] nums = {55,901,48,1771};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int digit = 0;

        for (int i = 0; i < nums.length; i++) {
            int current = 0;
            int num = nums[i];
            while (num != 0) {
                num = num/10;
                current++;
            }
            if(current % 2 == 0) {
                digit++;
            }
        }
        return digit;
    }
}
