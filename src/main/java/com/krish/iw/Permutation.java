package com.krish.iw;

import java.util.HashSet;

public class Permutation {

    public static HashSet<String> fullSEt = new HashSet<>();

    public static void main(String[] args) {
        String a = "abcd";
        perm(a);
        System.out.println(fullSEt);
    }

    private static void perm(String a) {
        System.out.println(a);
        fullSEt.add(a);
        for (int i = 0; i < a.length(); i++) {
            StringBuilder sb = new StringBuilder(a);
            if (sb.toString().length() > 1)
                perm(sb.deleteCharAt(i).toString());
        }
    }
}
