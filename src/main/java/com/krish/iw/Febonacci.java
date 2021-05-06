package com.krish.iw;

public class Febonacci {

    public static void main(String[] args) {
        System.out.print(febo(10));
    }

    private static int febo(int i) {
        if (i <= 1)
            return i;
        else
            return febo(i - 1) + febo(i - 2);
    }

    private static int feb(int i) {

        if (i <= 1)
            return i;

        int curr = 1;
        int prev = 1;

        for (int j = 2; j < i; j++) {
            int temp = curr;
            curr = curr + prev;
            prev = temp;
        }

        return curr;
    }
}
