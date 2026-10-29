// ──────────────────────────────────────────────────
// Problem  : 1122. Relative Sort Array
// Difficulty: Easy
// Tags     : Array, Hash Table, Sorting, Counting Sort, Quicksort, Bubble Sort
// Link     : https://leetcode.com/problems/relative-sort-array/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43216000 (beats 91%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int x : arr1) count[x]++;
        int[] ans = new int[arr1.length];
        int idx = 0;
        for (int x : arr2) {
            while (count[x] > 0) {
                ans[idx++] = x;
                count[x]--;
            }
        }
        for (int i = 0; i < 1001; i++) {
            while (count[i] > 0) {
                ans[idx++] = i;
                count[i]--;
            }
        }
        return ans;
    }
}