package com.krish.iw;

public class FingerCount {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int fingerIndex = 1;
        int hurtCount = 3;
        int maxRep = 10;

        checkCount(arr, fingerIndex-1, hurtCount, maxRep);
    }

    private static void checkCount(int[] arr, int fingerIndex, int hurtCount, int maxRep) {

        int iteration = 1;
        int totalHurt = 0;
        int count = 0;

        for (int i = 0; i < maxRep; i++) {
            if (iteration == 1) {
                
                for (int j=0; j<=arr.length-1;j++) {
                    System.out.println(arr[j]);
                    if(fingerIndex == j) {
                        totalHurt++;
                    }
                    if(totalHurt > hurtCount) {
                        break;
                    }
                    count++;
                }
            } else if (iteration % 2 == 0) {
                for (int j=arr.length-2; j>=0;j--) {
                    System.out.println(arr[j]);
                    if(fingerIndex == j) {
                        totalHurt++;
                    }
                    if(totalHurt > hurtCount) {
                        break;
                    }
                    
                    count++;
                }
            } else {
                for (int j=1; j<arr.length;j++) {
                    if(fingerIndex == j) {
                        totalHurt++;
                    }
                    if(totalHurt > hurtCount) {
                        break;
                    }
                    count++;
                }
            }
            iteration++;
        }
        System.out.println("count : "+count);
    }

}
