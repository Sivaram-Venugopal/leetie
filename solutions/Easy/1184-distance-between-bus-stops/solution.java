// ──────────────────────────────────────────────────
// Problem  : 1184. Distance Between Bus Stops
// Difficulty: Easy
// Tags     : Array
// Link     : https://leetcode.com/problems/distance-between-bus-stops/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43720000 (beats 88%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        int clockwise = 0, total = 0;
        for (int i = 0; i < distance.length; i++) {
            if (i >= start && i < destination) {
                clockwise += distance[i];
            }
            total += distance[i];
        }
        return Math.min(clockwise, total - clockwise);
    }
}