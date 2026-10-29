// ──────────────────────────────────────────────────
// Problem  : 941. Valid Mountain Array
// Difficulty: Easy
// Tags     : Array
// Link     : https://leetcode.com/problems/valid-mountain-array/
// Runtime  : 2 ms (beats 85%)
// Memory   : 46896000 (beats 94%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length, i = 0;
        while (i + 1 < n && arr[i] < arr[i + 1]) i++;
        if (i == 0 || i == n - 1) return false;
        while (i + 1 < n && arr[i] > arr[i + 1]) i++;
        return i == n - 1;
    }
}