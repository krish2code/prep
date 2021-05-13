package com.krish.string;

public class ReverseString {

    public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        reverse(str);
    }

    private static void reverse(String str) {
        char[] arr = str.toCharArray();
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            if (!isAlpha(arr[l])) {
                l++;
            } else  if (!isAlpha(arr[r])) {
                r--;
            } else {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    private static boolean isAlpha(char c) {
        return (c >= 'a' && c <= 'z');
    }
}
