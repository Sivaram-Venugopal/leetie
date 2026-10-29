// ──────────────────────────────────────────────────
// Problem  : 598. Range Addition II
// Difficulty: Easy
// Tags     : Array, Math
// Link     : https://leetcode.com/problems/range-addition-ii/
// Runtime  : 0 ms (beats 100%)
// Memory   : 47792000 (beats 98%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxCount(int m, int n, int ops[][] ) {
        int minR = m, minC = n;
        for (int[] op : ops) {
            minR = Math.min(minR, op[0]);
            minC = Math.min(minC, op[1]);
        }
        return minR * minC;
    }
}