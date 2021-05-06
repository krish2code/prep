package com.krish.iw.im;

import java.util.HashSet;
import java.util.Set;

public class ShortestSuperString {

    public static void main(String[] args) {
        String[] arr = {"geeks", "quiz", "for"};
        create(arr);
    }

    private static void create(String[] arr) {
        Set<Character> charSet = new HashSet<Character>(); 
        for(int i=0; i<arr.length ; i++) {
            char[] cArr = arr[i].toCharArray();
            for(int j=0; j<cArr.length; j++) {
                charSet.add(cArr[j]);
            }
        }
        
    }
}
