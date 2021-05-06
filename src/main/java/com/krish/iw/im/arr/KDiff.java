package com.krish.iw.im.arr;

import java.util.Arrays;


public class KDiff {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2,4,6};
        int k = 2;
        System.out.println(count(arr, k));
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






