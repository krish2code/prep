package com.krish.iw;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shortcut {

    public static void main(String[] args) {
        
        //int[] arr = new int[5];
        
        Integer[] arr = {1,2,3,4,5};
        
        //convert array to list
        List<Integer> lst = Arrays.asList(arr);
        
        System.out.println(lst);
        
        //convert lst to array
        
        arr = (Integer[]) lst.toArray();
        for (Integer integer : arr) {
            System.out.println(integer);
        }
        
        
        Map<String, String> map = new HashMap<String, String>();
        
        for (Map.Entry<String, String> entry : map.entrySet()) {
            
        }
    }
}
