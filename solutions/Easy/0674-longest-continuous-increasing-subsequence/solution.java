// ──────────────────────────────────────────────────
// Problem  : 674. Longest Continuous Increasing Subsequence
// Difficulty: Easy
// Tags     : Array
// Link     : https://leetcode.com/problems/longest-continuous-increasing-subsequence/
// Runtime  : 2 ms (beats 50%)
// Memory   : 46360000 (beats 91%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;
        int ans = 1, count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}