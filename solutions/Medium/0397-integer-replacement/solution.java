// ──────────────────────────────────────────────────
// Problem  : 397. Integer Replacement
// Difficulty: Medium
// Tags     : Dynamic Programming, Greedy, Bit Manipulation, Memoization
// Link     : https://leetcode.com/problems/integer-replacement/
// Runtime  : 0 ms (beats 100%)
// Memory   : 41672000 (beats 96%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int integerReplacement(int n) {
        long num = n; // avoid overflow when n = Integer.MAX_VALUE
        int steps = 0;

        while (num != 1) {
            if ((num & 1) == 0) {
                num >>= 1;
            } else {
                if (num == 3 || (num & 3) != 3) {
                    num--;
                } else {
                    num++;
                }
            }
            steps++;
        }

        return steps;
    }
}