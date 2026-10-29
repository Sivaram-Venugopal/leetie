// ──────────────────────────────────────────────────
// Problem  : 747. Largest Number At Least Twice of Others
// Difficulty: Easy
// Tags     : Array, Sorting
// Link     : https://leetcode.com/problems/largest-number-at-least-twice-of-others/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42520000 (beats 97%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int dominantIndex(int[] nums) {
        int maxIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIdx]) maxIdx = i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIdx && nums[maxIdx] < 2 * nums[i]) return -1;
        }
        return maxIdx;
    }
}