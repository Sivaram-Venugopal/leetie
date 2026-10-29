// ──────────────────────────────────────────────────
// Problem  : 985. Sum of Even Numbers After Queries
// Difficulty: Medium
// Tags     : Array, Simulation
// Link     : https://leetcode.com/problems/sum-of-even-numbers-after-queries/
// Runtime  : 5 ms (beats 75%)
// Memory   : 52500000 (beats 71%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int s = 0;
        for (int x : nums) {
            if (x % 2 == 0) s += x;
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0], idx = queries[i][1];
            if (nums[idx] % 2 == 0) s -= nums[idx];
            nums[idx] += val;
            if (nums[idx] % 2 == 0) s += nums[idx];
            ans[i] = s;
        }
        return ans;
    }
}