package com.striver.problems.arrays.medium;

/**
 * Leet : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * Difficulty : Easy
 * 
 * Status : Done 
 */
public class StockBuyAndSell_121 {
	
	/**
	 * Solution - Handled with min and max
	 * 
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices) {
        int profit =0, minPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, prices[i]-minPrice);

        }
        return profit;
    }

}
