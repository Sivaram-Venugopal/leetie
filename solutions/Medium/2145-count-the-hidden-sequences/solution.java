// ──────────────────────────────────────────────────
// Problem  : 2145. Count the Hidden Sequences
// Difficulty: Medium
// Tags     : Array, Prefix Sum
// Link     : https://leetcode.com/problems/count-the-hidden-sequences/
// Runtime  : 5 ms (beats 77%)
// Memory   : 113852000 (beats 34%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long prefix = 0;
        long minPrefix = 0, maxPrefix = 0;

        for (int diff : differences) {
            prefix += diff;
            minPrefix = Math.min(minPrefix, prefix);
            maxPrefix = Math.max(maxPrefix, prefix);
        }

        long minStart = lower - minPrefix;
        long maxStart = upper - maxPrefix;

        long count = maxStart - minStart + 1;
        return count > 0 ? (int) count : 0;
    }
}
