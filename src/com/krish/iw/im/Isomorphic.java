package com.krish.iw.im;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

    static HashMap<Character, Character> map = new HashMap<Character, Character>();;

    public static void main(String[] args) {
        String a = "fpppfv";
        String b = "lgggfd";

        System.out.println(check(a, b));
    }

    private static boolean check(String a, String b) {
        Map<Character, Character> seen = new HashMap<>();

        if (a == null || b == null)
            return false;

        if (a.length() == 0 && b.length() == 0)
            return true;

        if (a.length() != b.length())
            return false;

        boolean isomorphic = false;

        for (int i = 0; i < a.length(); i++) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);

            if(seen.get(c1) == null) {
                seen.put(c1, c2);
            } else {
                if (seen.get(c1) == c2) {
                    isomorphic = true;
                } else {
                    isomorphic = false;
                }
            }
        }
        return isomorphic;
    }

    private static Character getKey(char c) {
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            if (entry.getKey().equals(c))
                return entry.getValue();
        }
        return null;
    }
}
