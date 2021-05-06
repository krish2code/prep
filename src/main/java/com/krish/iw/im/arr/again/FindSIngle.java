package com.krish.iw.im.arr.again;

import java.util.HashSet;
import java.util.Iterator;

public class FindSIngle {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 6, 3 };
        System.out.println(find(arr));
    }

    private static int find(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int n : arr) {
                if (!set.add(n))
                        set.remove(n);
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
}
