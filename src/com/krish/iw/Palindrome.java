package com.krish.iw;

public class Palindrome {

    public static void main(String[] args) {
        int mx = 0;
        System.out.println("Starting");
        for (int i = 999; i > 99; i--) {
            for (int j = i; j > 99; j--) {

                int prd = i * j;
                String str = "" + prd;
                if (testPlaindrom(str.toCharArray())) {

                    // System.out.println("This is the number::" + str) ;
                    if (prd > mx)
                        mx = prd;
                    else if (prd < mx) {
                        break;
                    }
                }

            }
        }
        System.out.println("This is the number max::" + mx) ;
    }

    private static boolean testPlaindrom(char[] arr) {
        boolean bol = false;
        for (int i = 0; i < (arr.length - 1) / 2; i++) {
            if (arr[i] == arr[arr.length - 1 - i])
                bol = true;
            else
                bol = false;
        }
        return bol;
    }

    public static boolean isPlaindrom(int number) {
        
        StringBuilder sb1 = new StringBuilder(""+number);
        sb1.reverse();
        return sb1.toString().equals(""+number);
    }
}
