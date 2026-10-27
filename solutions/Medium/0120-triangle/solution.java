// ──────────────────────────────────────────────────
// Problem  : 120. Triangle
// Difficulty: Medium
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/triangle/
// Runtime  : 3 ms (beats 80%)
// Memory   : 44812000 (beats 95%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        int[] dp = new int[n + 1];

        for (int row = n - 1; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                dp[col] = triangle.get(row).get(col)
                        + Math.min(dp[col], dp[col + 1]);
            }
        }

        return dp[0];
    }
}