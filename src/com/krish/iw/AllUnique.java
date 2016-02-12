package com.krish.iw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AllUnique {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 4, 2, 4, 5, 6, 6, 7, 8, 8, 9 };
        findUnique(arr);
    }

    private static Set<Integer> findUnique(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : arr) {
            if(map.get(i) == null)
                map.put(i, 1);
            else {
                int count = map.get(i);
                count++;
                map.put(i, count);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
        return null;
    }
}
