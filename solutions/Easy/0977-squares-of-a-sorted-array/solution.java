// ──────────────────────────────────────────────────
// Problem  : 977. Squares of a Sorted Array
// Difficulty: Easy
// Tags     : Array, Two Pointers, Sorting
// Link     : https://leetcode.com/problems/squares-of-a-sorted-array/
// Runtime  : 1 ms (beats 100%)
// Memory   : 46424000 (beats 99%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int l = 0, r = n - 1;
        for (int idx = n - 1; idx >= 0; idx--) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                ans[idx] = nums[l] * nums[l];
                l++;
            } else {
                ans[idx] = nums[r] * nums[r];
                r--;
            }
        }
        return ans;
    }
}