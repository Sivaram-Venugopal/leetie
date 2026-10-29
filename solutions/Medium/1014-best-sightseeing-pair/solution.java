// ──────────────────────────────────────────────────
// Problem  : 1014. Best Sightseeing Pair
// Difficulty: Medium
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/best-sightseeing-pair/
// Runtime  : 4 ms (beats 90%)
// Memory   : 53716000 (beats 84%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxAns = 0;
        int maxPrev = values[0];
        for (int j = 1; j < values.length; j++) {
            maxAns = Math.max(maxAns, maxPrev + values[j] - j);
            maxPrev = Math.max(maxPrev, values[j] + j);
        }
        return maxAns;
    }
}