package com.krish.iw;

public class powerXN {

    public static void main(String[] args) {
        int power = power(2, 2);
        System.out.println(power);
    }

    private static int power(int x, int n) {
        if (n == 0)
            return 1;

        int temp = power(x, n / 2);

        if (n % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }
}
