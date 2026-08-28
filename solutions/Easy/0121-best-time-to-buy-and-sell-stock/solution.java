// ──────────────────────────────────────────────────
// Problem  : 121. Best Time to Buy and Sell Stock
// Difficulty: Easy
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Runtime  : 2 ms (beats 44%)
// Memory   : 94428000 (beats 52%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxProfit(int[] prices) {
        int minIndex = 0;
        int maxIndex = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            // update min if we find a smaller price
            if (prices[i] < prices[minIndex]) {
                minIndex = i;
                maxIndex = i; // reset max after new min
            }

            // update max if we find a bigger price after min
            if (prices[i] > prices[maxIndex]) {
                maxIndex = i;
            }

            // only compute profit if max comes after min
            if (maxIndex > minIndex) {
                profit = Math.max(profit, prices[maxIndex] - prices[minIndex]);
            }
        }

        return profit;
    }
}
