package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testMergeSort {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(20);
        input.add(4);
        input.add(18);
        input.add(15);
        input.add(19);
        input.add(1);
        
        List<Integer> lst = mergeSort(input);
        
        for (Integer object : lst) {
            System.out.println(object);
        }
    }

    private static List<Integer> mergeSort(List<Integer> list) {
        
        List<Integer> sortedLst = new ArrayList<Integer>();
        
        
        if(list == null || list.size() <= 1) {
            return list;
        } else {
            int mid = list.size()/2;
            
            List<Integer> lList = mergeSort(list.subList(0, mid));
            List<Integer> rList = mergeSort(list.subList(mid, list.size()));
            
            int i =0;
            int j = 0;
            
            while (i < lList.size() && j < rList.size()) {
                if(lList.get(i) < rList.get(j)) {
                    sortedLst.add(lList.get(i));
                    i++;
                } else {
                    sortedLst.add(rList.get(j));
                    j++;
                }
            }
            
            
            if(i < lList.size()) {
                while (i < lList.size()) {
                    sortedLst.add(lList.get(i));
                    i++;
                }
            }
            
            if(j < rList.size()) {
                while (j < rList.size()) {
                    sortedLst.add(rList.get(j));
                    j++;
                }
            }
           
           
        }
        
        
        return sortedLst;
    }
}
