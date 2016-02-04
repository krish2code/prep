package com.krish.iw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        //reverse(lst);
        reverseRecurssive(lst1);
        System.out.println(lst1);
    }

    private static void reverseRecurssive(ArrayList<Integer> lst) {
        if(lst.size() > 1) {
            int value = lst.remove(0);
            reverseRecurssive(lst);
            lst.add(value);
        }
    }

    private static void reverse(List<Integer> lst) {
        for (int i = lst.size()-1; i >= 0 ; i--) {
            System.out.print(lst.get(i) + "     ");
        }
    }
}
