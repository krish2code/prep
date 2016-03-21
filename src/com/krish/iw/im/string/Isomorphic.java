package com.krish.iw.im.string;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

    static HashMap<Character, Character> map = new HashMap<Character, Character>();;

    public static void main(String[] args) {
        String a = "fod";
        String b = "lgg";

        System.out.println(check(a, b));
    }

    private static boolean check(String a, String b) {
        if (a == null || b == null)
            return false;

        if (a.length() == 0 && b.length() == 0)
            return true;

        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);

        }
        return true;
    }

    private static Character getKey(char c) {
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            if (entry.getKey().equals(c))
                return entry.getValue();
        }
        return null;
    }
}
