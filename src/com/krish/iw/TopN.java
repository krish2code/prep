package com.krish.iw;

import java.util.PriorityQueue;

public class TopN {

    static PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 7, 8, 9, 3, 4, 5};

        topN(arr, 3);
    }

    private static void topN(int[] arr, int n) {

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
