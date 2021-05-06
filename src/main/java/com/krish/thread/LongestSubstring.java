package com.krish.thread;

import java.util.HashMap;

public class LongestSubstring {

    public static void main(String[] args) {
        String s = "abba";
        int count = lengthOfLongestSubstring(s);
        System.out.println(count);
    }

    private static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int maximum_length = 0;
        int start = 0;

        for(int i = 0; i < s.length(); i++) {
            if(seen.containsKey(s.charAt(i))) {
                start = Math.max(start, seen.get(s.charAt(i)) + 1);
            }
            seen.put(s.charAt(i), i);
            maximum_length = Math.max(maximum_length, i-start+1);
        }

        return maximum_length;
    }
}
