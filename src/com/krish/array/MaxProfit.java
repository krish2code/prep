package com.krish.array;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,2,5,3,10,4,1};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        else{
            int lowestPrice = Integer.MAX_VALUE;
            int maxProfit = 0;

            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < lowestPrice )
                    lowestPrice = prices[i];
                else if (maxProfit < (prices[i] - lowestPrice))
                    maxProfit = prices[i] - lowestPrice;
            }
            return maxProfit;
        }
    }


}
