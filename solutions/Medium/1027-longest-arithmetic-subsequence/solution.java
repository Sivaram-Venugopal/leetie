// ──────────────────────────────────────────────────
// Problem  : 1027. Longest Arithmetic Subsequence
// Difficulty: Medium
// Tags     : Array, Hash Table, Binary Search, Dynamic Programming
// Link     : https://leetcode.com/problems/longest-arithmetic-subsequence/
// Runtime  : 390 ms (beats 47%)
// Memory   : 120256000 (beats 50%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;
        int ans = 0;
        HashMap<Integer, Integer>[] dp = new HashMap[n];
        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                int diff = nums[i] - nums[j];
                int len = dp[j].getOrDefault(diff, 1) + 1;
                dp[i].put(diff, len);
                ans = Math.max(ans, len);
            }
        }
        return ans;
    }
}