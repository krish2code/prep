package com.krish.iw.im;

import java.util.HashMap;
import java.util.Map;

public class MaximumIntervalsOverlap {

    public static void main(String[] args) {
        int[] arrv = {1,2,3,4,5,6,7};
        int[] exit = {3,4,4,4,5,6,7};
        
        overlap(arrv, exit);
    }

    private static void overlap(int[] arrv, int[] exit) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int count =0;
        int occr = 0;
        int time = 0;
        
        for(int i : arrv) {
            if(map.get(i) == null) {
                map.put(i, 1);
            } else {
                count = map.get(i);
                count++;
                map.put(i, count);
                
                if(count > occr) {
                    occr = count;
                    time = i;
                }
                
            }
        }
        
        for(int i : exit) {
            if(map.get(i) == null) {
                map.put(i, 1);
            } else {
                count = map.get(i);
                count++;
                map.put(i, count);
                
                if(count > occr) {
                    occr = count;
                    time = i;
                }
            }
        }
        System.out.println(time);
    }
}
