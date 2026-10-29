// ──────────────────────────────────────────────────
// Problem  : 769. Max Chunks To Make Sorted
// Difficulty: Medium
// Tags     : Array, Stack, Greedy, Sorting, Monotonic Stack
// Link     : https://leetcode.com/problems/max-chunks-to-make-sorted/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42120000 (beats 88%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxChunksToSorted(int[] arr) {
        int ans = 0, mx = 0;
        for (int i = 0; i < arr.length; i++) {
            mx = Math.max(mx, arr[i]);
            if (mx == i) {
                ans++;
            }
        }
        return ans;
    }
}