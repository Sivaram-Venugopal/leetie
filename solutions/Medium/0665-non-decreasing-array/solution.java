// ──────────────────────────────────────────────────
// Problem  : 665. Non-decreasing Array
// Difficulty: Medium
// Tags     : Array
// Link     : https://leetcode.com/problems/non-decreasing-array/
// Runtime  : 1 ms (beats 49%)
// Memory   : 46708000 (beats 87%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean modified = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (modified) return false;
                modified = true;
                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                }
            }
        }
        return true;
    }
}