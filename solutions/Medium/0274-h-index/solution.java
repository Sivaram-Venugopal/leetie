// ──────────────────────────────────────────────────
// Problem  : 274. H-Index
// Difficulty: Medium
// Tags     : Array, Sorting, Counting Sort
// Link     : https://leetcode.com/problems/h-index/
// Runtime  : 17 ms (beats 7%)
// Memory   : 42980000 (beats 98%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int hIndex = 0;

        for (int h = 0; h <= n; h++) {
            int count = 0;
            for (int c : citations) {
                if (c >= h) count++;
            }
            if (count >= h) {
                hIndex = Math.max(hIndex, h);
            }
        }
        return hIndex;
    }
}
