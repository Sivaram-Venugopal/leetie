// ──────────────────────────────────────────────────
// Problem  : 667. Beautiful Arrangement II
// Difficulty: Medium
// Tags     : Array, Math
// Link     : https://leetcode.com/problems/beautiful-arrangement-ii/
// Runtime  : 1 ms (beats 100%)
// Memory   : 46460000 (beats 73%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        int l = 1, r = n;
        for (int i = 0; i < k; i++) {
            ans[i] = (i % 2 == 0) ? l++ : r--;
        }
        for (int i = k; i < n; i++) {
            ans[i] = (k % 2 == 0) ? r-- : l++;
        }
        return ans;
    }
}