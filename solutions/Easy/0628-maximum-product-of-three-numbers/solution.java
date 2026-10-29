// ──────────────────────────────────────────────────
// Problem  : 628. Maximum Product of Three Numbers
// Difficulty: Easy
// Tags     : Array, Math, Sorting
// Link     : https://leetcode.com/problems/maximum-product-of-three-numbers/
// Runtime  : 17 ms (beats 9%)
// Memory   : 47604000 (beats 67%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
    }
}