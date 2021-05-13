package com.krish.string;

import java.util.HashSet;
import java.util.Set;

public class ShortestSuperString {

    public static void main(String[] args) {
        String[] arr = {"geeks", "quiz", "for"};
        System.out.println(create(arr));
    }

    private static Set<Character> create(String[] arr) {
        Set<Character> charSet = new HashSet<Character>(); 
        for(int i=0; i<arr.length ; i++) {
            char[] cArr = arr[i].toCharArray();
            for(int j=0; j<cArr.length; j++) {
                charSet.add(cArr[j]);
            }
        }
        return charSet;
    }
}
