// ──────────────────────────────────────────────────
// Problem  : 795. Number of Subarrays with Bounded Maximum
// Difficulty: Medium
// Tags     : Array, Two Pointers
// Link     : https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/
// Runtime  : 3 ms (beats 99%)
// Memory   : 59172000 (beats 85%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return count(nums, right) - count(nums, left - 1);
    }
    
    private int count(int[] nums, int bound) {
        int res = 0, curr = 0;
        for (int x : nums) {
            curr = (x <= bound) ? curr + 1 : 0;
            res += curr;
        }
        return res;
    }
}