package com.krish.iw;

import java.util.ArrayList;
import java.util.Arrays;

public class Modulus {

    static int max_mod = 0;
    static ArrayList<Integer> maxList = null;

    public static void main(String[] args) {
        Integer[] a = { 4,3,1};
        ArrayList<Integer> lst = new ArrayList<Integer>(Arrays.asList(a));
        maxMod(lst, 8);
        System.out.println(max_mod);
        System.out.println(maxList + "::" + add(maxList));
    }

    private static void maxMod(ArrayList<Integer> lst, int number) {
        int sum = add(lst);
        int mod = sum % number;
        if (max_mod < mod) {
            max_mod = mod;
            maxList = lst ;
        }
        
        for (int i = 0; i < lst.size(); i++) {
            ArrayList<Integer> lstNew = new ArrayList<>(lst) ;
            if (lstNew.size() <= 1 )
                continue ;
            
            lstNew.remove(i);
            maxMod(lstNew, number);
        }
    }

    private static int add(ArrayList<Integer> lst) {
        int sum = 0;
        for (Integer integer : lst) {
            sum = sum + integer;
        }
        return sum;
    }
}
