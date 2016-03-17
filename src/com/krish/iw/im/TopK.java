package com.krish.iw.im;

public class TopK {

    public static void main(String[] args) {
        int[] lst = { 5, 7, 2, 9, 2, 4 };

        largest(lst, 3);
    }

    private static void largest(int[] array, int k) {
        if (k < 0 || k > array.length)
            return;
        else {
            int[] temp = new int[k];
            for (int i = 0; i < k; i++) {
                temp[i] = array[i]; // 5,7,2
            }

            int max = Integer.MAX_VALUE;
            int max_index = 0;

            for (int i = k; i < array.length; i++) {
                // iterate on temp array to find the smallest element and index
                for (int j = 0; j < temp.length; j++) { // temp array itr
                    if (temp[j] < max) { // 5<max, 7<5,2<5
                        max = temp[j]; // max = 5, 2
                        max_index = j; // 0,2
                    }
                }

                if (array[i] > temp[max_index])
                    temp[max_index] = array[i];
            }
            for (int i : temp) {
                System.out.print(i + " ");
            }
        }
    }
}
