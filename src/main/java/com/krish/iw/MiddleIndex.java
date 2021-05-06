package com.krish.iw;

public class MiddleIndex {

    public static void main(String[] args) throws Exception {
        int[] a = { 1, 2, 4, 4, 5, 4, 1, 1 };
        System.out.println(middleIndex(a));
    }

    private static int middleIndex(int[] arr) {

        int leftIndex = 0;
        int rightIndex = arr.length-1;
        int leftSum = 0;
        int rightSum = 0;
        
        while(true) {
            
            if(leftSum <= rightSum) {
                leftSum = leftSum + arr[leftIndex];
                leftIndex++;
            } else {
                rightSum = rightSum + arr[rightIndex];
                rightIndex--;
            }
            
            if(leftIndex > rightIndex) {
                if(leftSum == rightSum) {
                    break;
                } else {
                    System.out.println("no index");
                }
            }
        }

        return rightIndex;
    }

    private static int middleIndex1(int[] arr) {

        int rightIndex = arr.length - 1;
        int leftIndex = 0;
        int sumLeft = 0;
        int sumRight = 0;

        while (true) {
            if (sumLeft > sumRight) {
                sumRight = sumRight + arr[rightIndex];
                rightIndex = rightIndex - 1;
            } else {
                sumLeft = sumLeft + arr[leftIndex];
                leftIndex = leftIndex + 1;
            }

            if (leftIndex > rightIndex) {
                if (sumLeft == sumRight) {
                    break;
                } else {
                    System.out.println("none");
                }
            }
        }

        return rightIndex;
    }

    // private static int middleIndex(int[] numbers) throws Exception {
    // int endIndex = numbers.length - 1;
    // int startIndex = 0;
    // int sumLeft = 0;
    // int sumRight = 0;
    // while (true) {
    // if (sumLeft > sumRight) {
    // sumRight = sumRight+ numbers[endIndex--];
    // } else {
    // sumLeft = sumLeft + numbers[startIndex++];
    // }
    // if (startIndex > endIndex) {
    // if (sumLeft == sumRight) {
    // break;
    // } else {
    // throw new Exception(
    // "Please pass proper array to match the requirement");
    // }
    // }
    // }
    // return endIndex;
    // }
}
