package com.krish.array;

import java.util.PriorityQueue;

public class TopNValuesInArray {

    public static void main(String[] args) {
        int[] arr = { 6, 2, 1, 7, 9, 8, 3, 4, 5};

        topN(arr, 3);
    }

    private static void topN(int[] arr, int n) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        if (n > arr.length)
            return;

        for (int i = 0; i < arr.length; i++) {
            if (pq.size() < n) {
                pq.offer(arr[i]);
                continue;
            }

            if (pq.peek() < arr[i]) {
                pq.poll();
                pq.offer(arr[i]);
            }
        }
        System.out.println(pq);
    }
}
