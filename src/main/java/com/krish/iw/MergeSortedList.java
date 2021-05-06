package com.krish.iw;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedList {
    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<Integer>();
        List<Integer> lst2 = new ArrayList<Integer>();

        lst1.add(1);
        lst1.add(3);
        lst1.add(5);
        lst1.add(7);
        lst1.add(9);
        lst1.add(11);
        lst1.add(13);

        lst2.add(1);
        lst2.add(2);
        lst2.add(4);
        lst2.add(6);
        lst2.add(8);
        lst2.add(10);

        merge(lst1, lst2);

    }

    private static void merge(List<Integer> lst1, List<Integer> lst2) {
        int i = 0;
        int j = 0;
        List<Integer> lst = new ArrayList<Integer>();
        while (i < lst1.size() || j < lst2.size()) {
            if (i < lst1.size() && j < lst2.size()) {
                if (lst1.get(i) <= lst2.get(j)) {
                    lst.add(lst1.get(i));
                    i++;
                } else {
                    lst.add(lst2.get(j));
                    j++;
                }
            } else {
                if (lst1.size() > i) {
                    lst.addAll(lst1.subList(i, lst1.size()));
                    i = lst1.size();
                }

                if (lst2.size() > j) {
                    lst.addAll(lst2.subList(j, lst2.size()));
                    j = lst2.size();
                }
            }

        }
        System.out.println(lst);
    }

}
