// ──────────────────────────────────────────────────
// Problem  : 121. Best Time to Buy and Sell Stock
// Difficulty: Easy
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Runtime  : 1 ms (beats 100%)
// Memory   : 94560000 (beats 33%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        int n = prices.length;
        for(int i=0;i<n;i++){
            min = Math.min(min , prices[i]);
            int profit  = prices[i] - min;
            if(max < profit){
                max = profit;
            }
        }
        
        return max;
    }
}