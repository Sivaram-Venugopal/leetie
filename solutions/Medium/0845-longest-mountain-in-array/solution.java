// ──────────────────────────────────────────────────
// Problem  : 845. Longest Mountain in Array
// Difficulty: Medium
// Tags     : Array, Two Pointers, Dynamic Programming, Enumeration
// Link     : https://leetcode.com/problems/longest-mountain-in-array/
// Runtime  : 3 ms (beats 76%)
// Memory   : 46720000 (beats 93%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length, ans = 0, i = 1;
        while (i < n - 1) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                int left = i, right = i;
                while (left > 0 && arr[left - 1] < arr[left]) left--;
                while (right < n - 1 && arr[right] > arr[right + 1]) right++;
                ans = Math.max(ans, right - left + 1);
                i = right;
            } else {
                i++;
            }
        }
        return ans;
    }
}