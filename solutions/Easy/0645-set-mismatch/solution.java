// ──────────────────────────────────────────────────
// Problem  : 645. Set Mismatch
// Difficulty: Easy
// Tags     : Array, Hash Table, Bit Manipulation, Sorting
// Link     : https://leetcode.com/problems/set-mismatch/
// Runtime  : 2 ms (beats 96%)
// Memory   : 47356000 (beats 77%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];
        for (int x : nums) count[x]++;
        int dup = -1, missing = -1;
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) dup = i;
            else if (count[i] == 0) missing = i;
        }
        return new int[]{dup, missing};
    }
}