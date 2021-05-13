package com.krish.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;


public class KDiff {
    public static void main(String[] args) {
        int[] arr = {1,5,3,3,4,2,6};
        int k = 2;
        System.out.println(countAgain(arr, k));
    }

    private static int countAgain(int[] arr, int k) {
        ArrayList<Integer> seen = new ArrayList<>();

        int count =0;

        for(int i=0; i<arr.length; i++) {
            seen.add(arr[i]);

            if(seen.contains(arr[i]-k)) {
                count++;
            }
            if (seen.contains(arr[i]+k)) {
                count++;
            }
        }

        return count;
    }

    private static int count(int[] arr, int k) {
        if(arr == null || arr.length == 0)
            return 0;
        
        int kDiffCount = 0;
        
        Arrays.sort(arr); //1,2,3,4,5
        
        for(int i=0; i<arr.length; i++) {
            if(binarySearch(arr[i]+k, arr, i, arr.length-1))
                kDiffCount++;
        }
            
        return kDiffCount;    
    }

    private static boolean binarySearch(int i, int[] arr, int min, int max) {
        if(max < min)
            return false;
        
        int midIndex = (max+min)/2;
        
        if(arr[midIndex] > i) {
            return binarySearch(i, arr, min, midIndex-1);
        } else if(arr[midIndex] < i) {
            return binarySearch(i, arr, midIndex+1, max);
        } else if(i == arr[midIndex]){
            return true;
        }
        
        return false;
    }
}






