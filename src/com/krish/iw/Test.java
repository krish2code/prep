package com.krish.iw;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(20);
        input.add(4);
        input.add(18);
        input.add(15);

        List<Integer> sortedList = mergeSort(input);
        System.out.println(sortedList);

    }

    private static List<Integer> mergeSort(List<Integer> lst) {
        
        if(lst == null || lst.size() ==1)
            return lst;
        
        int midIndex = lst.size()/2;
        
        List<Integer> lList = mergeSort(lst.subList(0, midIndex));
        List<Integer> rList = mergeSort(lst.subList(midIndex, lst.size()));
        
        int i =0;
        int j=0;
        
        List<Integer> sortedList = new ArrayList<Integer>();
        
        while(i<lList.size() && j < rList.size()) {
            if(lList.get(i) < rList.get(j)) {
                sortedList.add(lList.get(i));
                i++;
            } else {
                sortedList.add(rList.get(j));
                j++;
            }
        }
        
        if(i < lList.size()) {
            sortedList.addAll(lList.subList(i, lList.size()));
        }
        
        if(j < rList.size()) {
            sortedList.addAll(rList.subList(i, rList.size()));
        }
        
        return sortedList;
    }



}
