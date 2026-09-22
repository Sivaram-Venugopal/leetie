// ──────────────────────────────────────────────────
// Problem  : 198. House Robber
// Difficulty: Medium
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/house-robber/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42916000 (beats 19%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int prev2 = nums[0];              // dp[i-2]
        int prev1 = Math.max(nums[0], nums[1]); // dp[i-1]
        
        for (int i = 2; i < nums.length; i++) {
            int curr = Math.max(prev1, nums[i] + prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
