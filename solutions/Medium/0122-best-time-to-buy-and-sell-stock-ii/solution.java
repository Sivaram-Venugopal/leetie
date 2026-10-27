// ──────────────────────────────────────────────────
// Problem  : 122. Best Time to Buy and Sell Stock II
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Greedy
// Link     : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// Runtime  : 0 ms (beats 100%)
// Memory   : 45620000 (beats 98%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}