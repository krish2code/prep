package com.krish.array;

import java.util.HashSet;
import java.util.Set;

public class AllDuplicate {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 4, 2, 4, 5, 6, 6, 7, 8, 8, 9 };
        Set<Integer> dupSet = findDuplicate(arr);
        System.out.println(dupSet);
    }

    private static Set<Integer> findDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> dupSet = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if(set.contains(arr[i]))
                dupSet.add(arr[i]);
            else
                set.add(arr[i]);
        }
        return dupSet;
    }
}
