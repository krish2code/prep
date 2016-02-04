package com.krish.iw;

public class FizzBuzz {
    public static void main(String[] args) {
        printFizzBuzz(100);
    }

    private static void printFizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (i == 0)
                System.out.print(i + " ");
            else if (i % (3 * 5) == 0)
                System.out.print(" FizzBuzz ");
            if (i % 3 == 0)
                System.out.print(" Fizz ");
            else if (i % 5 == 0)
                System.out.print(" Buzz ");
            else
                System.out.print(" " + i + " ");
        }
    }
}
