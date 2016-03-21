package com.krish.iw.im.arr.again;

import java.util.HashMap;

public class ZeroSumInArr {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, -2, -1, 9, 4 };
        System.out.println(find(arr));
    }

    private static boolean find(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            // Add current element to sum
            sum = sum + arr[i];

            System.out.println("i : " + i);
            System.out.println("arr[i] : " + arr[i]);
            System.out.println("sum : " + sum);
            System.out.println("**************************");

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash map

            if (arr[i] == 0 || sum == 0 || map.get(sum) != null)
                return true;

            // Add sum to hash map
            map.put(sum, i);
        }

        return false;
    }
}
