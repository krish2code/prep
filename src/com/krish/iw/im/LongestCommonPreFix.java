package com.krish.iw.im;

public class LongestCommonPreFix {

    public static void main(String[] args) {
        String[] arr = { "aj", "a", "aje"};
        System.out.println(preFix(arr));
    }

    private static String preFix(String[] arr) {
        if (arr.length == 0) {
            return "";
        }

        for(int i=0; i<arr[0].length(); i++) {
            char c = arr[0].charAt(i);
            
            for(int j=1; j<arr.length; j++) {
                if(i >= arr[j].length() || arr[j].charAt(i) != c) {
                    return arr[j].substring(0,i);
                }
            }
        }

        return arr[0];
    }
}
