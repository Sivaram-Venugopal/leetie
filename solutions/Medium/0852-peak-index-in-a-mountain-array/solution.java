// ──────────────────────────────────────────────────
// Problem  : 852. Peak Index in a Mountain Array
// Difficulty: Medium
// Tags     : Array, Binary Search, Ternary Search
// Link     : https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Runtime  : 0 ms (beats 100%)
// Memory   : 79708000 (beats 91%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < arr[mid + 1]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}