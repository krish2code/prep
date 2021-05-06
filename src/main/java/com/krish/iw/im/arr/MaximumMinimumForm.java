package com.krish.iw.im.arr;

public class MaximumMinimumForm {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        arrange(arr);
    }

    private static void arrange(int[] arr) {
        int[] newArr = new int[arr.length];

        int i = 0;
        int j = arr.length - 1;
        int index =0;
        
        while (i < j) {
            newArr[index++] = arr[j];
            newArr[index++] = arr[i];
            i++;
            j--;
        }

        if(i==j) {
            newArr[index++] = arr[i];
        }
        
        for (int k = 0; k < newArr.length; k++) {
            System.out.println(newArr[k]);
        }

    }
}
