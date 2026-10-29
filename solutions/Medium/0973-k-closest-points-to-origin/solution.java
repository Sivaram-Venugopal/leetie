// ──────────────────────────────────────────────────
// Problem  : 973. K Closest Points to Origin
// Difficulty: Medium
// Tags     : Array, Math, Divide and Conquer, Geometry, Sorting, Heap (Priority Queue), Quickselect, K-D Tree
// Link     : https://leetcode.com/problems/k-closest-points-to-origin/
// Runtime  : 22 ms (beats 90%)
// Memory   : 60128000 (beats 10%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (a, b) -> (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1]));
        return Arrays.copyOfRange(points, 0, k);
    }
}