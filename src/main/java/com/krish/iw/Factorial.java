package com.krish.iw;

public class Factorial {

    public static void main(String[] args) {

        int a = fact(5);
        System.out.println(a);
    }

    private static int fact(int n) {
        if (n == 0)
            return 1;

        return n * fact(n - 1);

    }
}
