// ──────────────────────────────────────────────────
// Problem  : 1053. Previous Permutation With One Swap
// Difficulty: Medium
// Tags     : Array, Greedy
// Link     : https://leetcode.com/problems/previous-permutation-with-one-swap/
// Runtime  : 0 ms (beats 100%)
// Memory   : 46864000 (beats 94%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int n = arr.length;
        int i = n - 2;
        while (i >= 0 && arr[i] <= arr[i + 1]) {
            i--;
        }
        if (i < 0) return arr;
        
        int j = n - 1;
        while (arr[j] >= arr[i] || arr[j] == arr[j - 1]) {
            j--;
        }
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}