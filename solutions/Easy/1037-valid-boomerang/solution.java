// ──────────────────────────────────────────────────
// Problem  : 1037. Valid Boomerang
// Difficulty: Easy
// Tags     : Array, Math, Geometry
// Link     : https://leetcode.com/problems/valid-boomerang/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42424000 (beats 89%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isBoomerang(int[][] points) {
        return (points[1][1] - points[0][1]) * (points[2][0] - points[1][0]) != 
               (points[2][1] - points[1][1]) * (points[1][0] - points[0][0]);
    }
}