package com.krish.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSortNew {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(20);
        input.add(4);
        input.add(18);
        input.add(15);
        input.add(19);
        input.add(1);

        List<Integer> sortedList = mergeSort(input);

        for (Integer i : sortedList) {
            System.out.println(i);
        }
    }

    private static List<Integer> mergeSort(List<Integer> input) {

        if (input == null || input.size() <= 1) {
            return input;
        }

        int mid = input.size() / 2;

        List<Integer> lList = mergeSort(input.subList(0, mid));
        List<Integer> rList = mergeSort(input.subList(mid, input.size()));

        int i = 0;
        int j = 0;

        List<Integer> sortedList = new ArrayList<Integer>();

        while (i < lList.size() && j < rList.size()) {
            if (lList.get(i) < rList.get(j)) {
                sortedList.add(lList.get(i));
                i++;
            } else {
                sortedList.add(rList.get(j));
                j++;
            }
        }

        if (i < lList.size())
            while (i < lList.size()) {
                sortedList.add(lList.get(i));
                i++;
            }

        if (j < rList.size()) {
            while (j < rList.size()) {
                sortedList.add(rList.get(j));
                j++;
            }
        }

        return sortedList;
    }
}
