// ──────────────────────────────────────────────────
// Problem  : 1806. Minimum Number of Operations to Reinitialize a Permutation
// Difficulty: Medium
// Tags     : Array, Math, Simulation
// Link     : https://leetcode.com/problems/minimum-number-of-operations-to-reinitialize-a-permutation/
// Runtime  : 0 ms (beats 100%)
// Memory   : 41888000 (beats 95%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int reinitializePermutation(int n) {
        int pos = 1;  // start tracking index 1
        int count = 0;

        while (true) {
            if (pos % 2 == 0) {
                pos = pos / 2;
            } else {
                pos = n / 2 + (pos - 1) / 2;
            }
            count++;
            if (pos == 1) return count;
        }
    }
}
