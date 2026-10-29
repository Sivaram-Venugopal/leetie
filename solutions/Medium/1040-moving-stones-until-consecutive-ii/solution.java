// ──────────────────────────────────────────────────
// Problem  : 1040. Moving Stones Until Consecutive II
// Difficulty: Medium
// Tags     : Array, Math, Sliding Window, Sorting
// Link     : https://leetcode.com/problems/moving-stones-until-consecutive-ii/
// Runtime  : 10 ms (beats 95%)
// Memory   : 47980000 (beats 33%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] numMovesStonesII(int[] stones) {
        Arrays.sort(stones);
        int n = stones.length;
        int maxMoves = Math.max(stones[n - 1] - stones[1] - n + 2, stones[n - 2] - stones[0] - n + 2);
        
        int minMoves = n;
        int i = 0;
        for (int j = 0; j < n; j++) {
            while (stones[j] - stones[i] >= n) {
                i++;
            }
            int alreadyInWindow = j - i + 1;
            if (alreadyInWindow == n - 1 && stones[j] - stones[i] == n - 2) {
                minMoves = Math.min(minMoves, 2);
            } else {
                minMoves = Math.min(minMoves, n - alreadyInWindow);
            }
        }
        return new int[]{minMoves, maxMoves};
    }
}