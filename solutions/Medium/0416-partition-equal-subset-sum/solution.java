// ──────────────────────────────────────────────────
// Problem  : 416. Partition Equal Subset Sum
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Knapsack Problem, 0-1 Knapsack
// Link     : https://leetcode.com/problems/partition-equal-subset-sum/
// Runtime  : 33 ms (beats 68%)
// Memory   : 43008000 (beats 100%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if ((sum & 1) == 1) {
            return false;
        }

        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        return dp[target];
    }
}