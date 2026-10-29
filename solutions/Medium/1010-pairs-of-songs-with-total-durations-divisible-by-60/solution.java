// ──────────────────────────────────────────────────
// Problem  : 1010. Pairs of Songs With Total Durations Divisible by 60
// Difficulty: Medium
// Tags     : Array, Hash Table, Counting
// Link     : https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
// Runtime  : 3 ms (beats 89%)
// Memory   : 49468000 (beats 95%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] remainderCount = new int[60];
        int ans = 0;
        for (int t : time) {
            int rem = t % 60;
            int target = (60 - rem) % 60;
            ans += remainderCount[target];
            remainderCount[rem]++;
        }
        return ans;
    }
}