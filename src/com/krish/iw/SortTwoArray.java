package com.krish.iw;

public class SortTwoArray {

    public static void main(String[] args) {
        int ar1[] = { 1, 5, 9, 10, 15, 20 };
        int ar2[] = { 2, 3, 8, 13 };

        sort(ar1, ar2);
    }

    private static void sort(int[] ar1, int[] ar2) {
        int len1 = ar1.length;
        int len2 = ar2.length;

        for (int i = len2-1; i >= 0; i--) {
            int j = 0;
            int last = ar1[len1 - 1];

            for (j = len1 - 1; j >= 0 && ar1[j] > ar2[i]; j--) {
                ar1[j + 1] = ar1[j];
            }
            
            if (j != len1 - 1) {
                ar1[j + 1] = ar2[i];
                ar2[i] = last;
            }
        }
        for (int i : ar1) {
            System.out.print(ar1[i]);
        }
        
        System.out.println("");
        
        for (int i : ar2) {
            System.out.print(ar2[i]);
        }
        
    }
}
