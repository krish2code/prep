package com.krish.array;

public class BalancedPartition {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(balancedPartition(arr));
    }

    private static boolean balancedPartition(int[] arr) {
        if(sum(arr)%2 == 0)
            return false;
        return true;
    }

    private static int sum(int[] arr) {
        int count =0;
        for (int i : arr) {
            count = count + i;
        }
        return count;
    }
}
