package com.krish.iw;



public class Febonacci {

    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            System.out.print(febo(i) + " ");
        }
    }

    private static int febo(int i) {
        if (i <= 1)
            return i;
        else
            return febo(i - 1) + febo(i - 2);
    }
}
