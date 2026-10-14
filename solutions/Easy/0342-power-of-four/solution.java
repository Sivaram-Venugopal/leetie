// ──────────────────────────────────────────────────
// Problem  : 342. Power of Four
// Difficulty: Easy
// Tags     : Math, Bit Manipulation, Recursion
// Link     : https://leetcode.com/problems/power-of-four/
// Runtime  : 1 ms (beats 90%)
// Memory   : 42272000 (beats 92%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
}