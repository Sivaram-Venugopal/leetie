// ──────────────────────────────────────────────────
// Problem  : 189. Rotate Array
// Difficulty: Medium
// Tags     : Array, Math, Two Pointers
// Link     : https://leetcode.com/problems/rotate-array/
// Runtime  : 5 ms (beats 47%)
// Memory   : 268284000 (beats 91%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}