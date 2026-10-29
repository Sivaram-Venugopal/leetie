// ──────────────────────────────────────────────────
// Problem  : 905. Sort Array By Parity
// Difficulty: Easy
// Tags     : Array, Two Pointers, Sorting
// Link     : https://leetcode.com/problems/sort-array-by-parity/
// Runtime  : 1 ms (beats 52%)
// Memory   : 46644000 (beats 72%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            if (nums[l] % 2 > nums[r] % 2) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
            if (nums[l] % 2 == 0) l++;
            if (nums[r] % 2 == 1) r--;
        }
        return nums;
    }
}