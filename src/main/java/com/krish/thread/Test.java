package com.krish.thread;

public class Test {
    public static void main(String[] args) {
        String a = "remuneration";
        String b = "acquiesce";
        int l = 5;

        int blength = b.length();
        String c = a.substring(0, l).concat(b.substring(blength-l, blength));

        System.out.println(c);

        test();
    }

    private static void test() {
        String a = "abcdef";

        System.out.println(a.charAt(1));
        System.out.println(a.length());
        System.out.println(a.toCharArray());
        System.out.println(a.compareTo("abcdeff"));
        System.out.println(a.contains("abc"));
        System.out.println(a.split("cd"));
        System.out.println(a.startsWith("b", 1));
        System.out.println(a.concat("ghi"));
        System.out.println(a.codePointAt(1));
        System.out.println(a.indexOf("a"));
        System.out.println(a.lastIndexOf("a"));
        System.out.println(a.replace("ab", "xz"));
        System.out.println(a.matches("abcdef"));
    }
}
