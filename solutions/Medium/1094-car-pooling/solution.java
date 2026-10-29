// ──────────────────────────────────────────────────
// Problem  : 1094. Car Pooling
// Difficulty: Medium
// Tags     : Array, Sorting, Heap (Priority Queue), Simulation, Prefix Sum
// Link     : https://leetcode.com/problems/car-pooling/
// Runtime  : 2 ms (beats 71%)
// Memory   : 45744000 (beats 91%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] timeline = new int[1001];
        for (int[] trip : trips) {
            timeline[trip[1]] += trip[0];
            timeline[trip[2]] -= trip[0];
        }
        
        int passengers = 0;
        for (int p : timeline) {
            passengers += p;
            if (passengers > capacity) return false;
        }
        return true;
    }
}
