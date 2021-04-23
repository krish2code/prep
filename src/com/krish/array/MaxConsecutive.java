package com.krish.array;

public class MaxConsecutive {
    public static void main(String[] args) {

        int[] arr = {1,0,1,1,0,1};

        System.out.println(maxConsecutive(arr));
    }

    private static int maxConsecutive(int[] arr) {

        if(arr.length == 0)
            return 0;
        else{
            int current = 0;
            int overall = 0;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 1) {
                    current++;
                    if(overall < current)
                        overall = current;
                } else {
                    current = 0;
                }
            }
            return overall;
        }
    }
}
