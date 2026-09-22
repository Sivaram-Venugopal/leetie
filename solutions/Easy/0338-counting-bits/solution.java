// ──────────────────────────────────────────────────
// Problem  : 338. Counting Bits
// Difficulty: Easy
// Tags     : Dynamic Programming, Bit Manipulation
// Link     : https://leetcode.com/problems/counting-bits/
// Runtime  : 2 ms (beats 96%)
// Memory   : 48508000 (beats 70%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i >> 1] + (i & 1);
        }
        return dp;
    }
}
