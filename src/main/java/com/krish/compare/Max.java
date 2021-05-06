package com.krish.compare;

import java.util.ArrayList;
import java.util.List;

public class Max {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 19, 28, 45, 23, 12, 35, 56, 24, 57, 78 };
        top5(a);
    }

    private static void top5(int[] a) {

        List<Integer> top5Lst = new ArrayList<Integer>();
        int lowest = 0;

        for (int i = 0; i < a.length - 1; i++) {

            if (lowest < a[i]) {
                if (top5Lst.size() <= 10) {
                    top5Lst.add(a[i]);
                } else {
                    
                }
            }

        }
    }
}
