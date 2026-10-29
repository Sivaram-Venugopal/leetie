// ──────────────────────────────────────────────────
// Problem  : 896. Monotonic Array
// Difficulty: Easy
// Tags     : Array
// Link     : https://leetcode.com/problems/monotonic-array/
// Runtime  : 3 ms (beats 25%)
// Memory   : 84480000 (beats 97%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]) inc = false;
            if (nums[i] < nums[i+1]) dec = false;
        }
        return inc || dec;
    }
}