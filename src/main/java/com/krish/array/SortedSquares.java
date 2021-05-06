package com.krish.array;

public class SortedSquares {

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] newNums = sortedSquares(nums);
        for (int i=0; i < newNums.length; i++) {
            System.out.println(newNums[i]);
        }

    }

    private static int[] sortedSquares(int[] nums) {
        if (nums.length == 0)
            return new int[0];
        else {
            int len = nums.length;
            int front = 0;
            int back = len-1;

            int[] temp = new int[len];

            for (int i = len -1; i >= 0; i--) {
                if (nums[back]*nums[back] > nums[front]*nums[front]) {
                    temp[i] = nums[back] * nums[back];
                    back--;
                } else {
                    temp[i] = nums[front] * nums[front];
                    front++;
                }
            }
            return temp;
        }
    }

//    private static int[] sortedSquares(int[] nums) {
//        if (nums.length == 0)
//            return new int[0];
//        else {
//            int breakIndex;
//
//            for (breakIndex=0; breakIndex< nums.length; breakIndex++) {
//                if (nums[breakIndex] >= 0) {
//                    break;
//                }
//            }
//
//            int firstHalfIndex = breakIndex -1;
//            int secondHalfIndex = breakIndex;
//            int newArrIndex = 0;
//
//            int len = nums.length;
//            int[] temp = new int[len];
//
//
//            while (firstHalfIndex >= 0 && secondHalfIndex < len) {
//                if(nums[firstHalfIndex] * nums[firstHalfIndex] < nums[secondHalfIndex] * nums[secondHalfIndex]) {
//                    temp[newArrIndex] = nums[firstHalfIndex] * nums[firstHalfIndex];
//                    firstHalfIndex--;
//                } else {
//                    temp[newArrIndex] = nums[secondHalfIndex] * nums[secondHalfIndex];
//                    secondHalfIndex++;
//                }
//                newArrIndex++;
//            }
//
//            while (firstHalfIndex >= 0) {
//                temp[newArrIndex] = nums[firstHalfIndex] * nums[firstHalfIndex];
//                firstHalfIndex--;
//            }
//
//            while (secondHalfIndex < len) {
//                temp[secondHalfIndex] = nums[secondHalfIndex] * nums[secondHalfIndex];
//                secondHalfIndex++;
//            }
//
//            return temp;
//        }
//    }

}
