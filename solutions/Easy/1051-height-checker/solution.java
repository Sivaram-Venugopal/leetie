// ──────────────────────────────────────────────────
// Problem  : 1051. Height Checker
// Difficulty: Easy
// Tags     : Array, Sorting, Counting Sort, Bubble Sort
// Link     : https://leetcode.com/problems/height-checker/
// Runtime  : 4 ms (beats 76%)
// Memory   : 43016000 (beats 81%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
}