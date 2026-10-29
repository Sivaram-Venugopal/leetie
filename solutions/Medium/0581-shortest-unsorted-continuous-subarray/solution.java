// ──────────────────────────────────────────────────
// Problem  : 581. Shortest Unsorted Continuous Subarray
// Difficulty: Medium
// Tags     : Array, Two Pointers, Stack, Greedy, Sorting, Monotonic Stack
// Link     : https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
// Runtime  : 1 ms (beats 87%)
// Memory   : 46304000 (beats 99%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int left = -1, right = -1;
        int maxVal = Integer.MIN_VALUE, minVal = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            maxVal = Math.max(maxVal, nums[i]);
            if (nums[i] < maxVal) right = i;
        }
        
        for (int i = n - 1; i >= 0; i--) {
            minVal = Math.min(minVal, nums[i]);
            if (nums[i] > minVal) left = i;
        }
        
        return right == -1 ? 0 : right - left + 1;
    }
}