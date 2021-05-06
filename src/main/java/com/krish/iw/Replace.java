package com.krish.iw;

public class Replace {

    public static void main(String[] args) {
        String str = "ajeet";
        replace(str, 'a');
    }

    private static void replace(String str, char c) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(1, c);
        System.out.println(sb);
    }
}
