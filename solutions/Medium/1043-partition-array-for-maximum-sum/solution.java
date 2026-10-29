// ──────────────────────────────────────────────────
// Problem  : 1043. Partition Array for Maximum Sum
// Difficulty: Medium
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/partition-array-for-maximum-sum/
// Runtime  : 7 ms (beats 54%)
// Memory   : 43228000 (beats 96%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int currMax = 0;
            for (int j = 1; j <= Math.min(i, k); j++) {
                currMax = Math.max(currMax, arr[i - j]);
                dp[i] = Math.max(dp[i], dp[i - j] + currMax * j);
            }
        }
        return dp[n];
    }
}