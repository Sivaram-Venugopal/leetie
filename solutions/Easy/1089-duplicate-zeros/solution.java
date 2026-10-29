// ──────────────────────────────────────────────────
// Problem  : 1089. Duplicate Zeros
// Difficulty: Easy
// Tags     : Array, Two Pointers
// Link     : https://leetcode.com/problems/duplicate-zeros/
// Runtime  : 1 ms (beats 100%)
// Memory   : 46308000 (beats 93%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────


class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0, n = arr.length;
        for (int x : arr) if (x == 0) zeros++;
        
        for (int i = n - 1; i >= 0; i--) {
            if (i + zeros < n) {
                arr[i + zeros] = arr[i];
            }
            if (arr[i] == 0) {
                zeros--;
                if (i + zeros < n) {
                    arr[i + zeros] = 0;
                }
            }
        }
    }
}