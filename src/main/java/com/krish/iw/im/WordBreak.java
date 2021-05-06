package com.krish.iw.im;

public class WordBreak {

    static String[] dict = { "i", "love", "ice", "cream" };

    public static void main(String[] args) {
        System.out.println(wordBreak("iloveice"));
    }

    private static boolean wordBreak(String str) {
        if (str == null)
            return false;

        if (str.length() == 0)
            return true;

        for (int i = 1; i <= str.length(); i++) {
            if (dictContains(str.substring(0, i)) && wordBreak(str.substring(i, str.length())))
                return true;
        }
        return false;
    }

    private static boolean dictContains(String subStr) {
        for (int i = 0; i < dict.length; i++) {
            if (dict[i].equals(subStr))
                return true;
        }

        return false;
    }
}
