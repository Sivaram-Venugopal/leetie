// ──────────────────────────────────────────────────
// Problem  : 1144. Decrease Elements To Make Array Zigzag
// Difficulty: Medium
// Tags     : Array, Greedy
// Link     : https://leetcode.com/problems/decrease-elements-to-make-array-zigzag/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42320000 (beats 90%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int movesToMakeZigzag(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        for (int i = 0; i < 2; i++) {
            for (int j = i; j < n; j += 2) {
                int left = (j > 0) ? nums[j - 1] : Integer.MAX_VALUE;
                int right = (j < n - 1) ? nums[j + 1] : Integer.MAX_VALUE;
                int target = Math.min(left, right);
                if (nums[j] >= target) {
                    ans[i] += nums[j] - target + 1;
                }
            }
        }
        return Math.min(ans[0], ans[1]);
    }
}