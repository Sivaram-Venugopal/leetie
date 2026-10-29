// ──────────────────────────────────────────────────
// Problem  : 1109. Corporate Flight Bookings
// Difficulty: Medium
// Tags     : Array, Prefix Sum
// Link     : https://leetcode.com/problems/corporate-flight-bookings/
// Runtime  : 3 ms (beats 98%)
// Memory   : 84368000 (beats 80%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n + 1];
        for (int[] b : bookings) {
            res[b[0] - 1] += b[2];
            res[b[1]] -= b[2];
        }
        for (int i = 1; i < n; i++) {
            res[i] += res[i - 1];
        }
        int[] ans = new int[n];
        System.arraycopy(res, 0, ans, 0, n);
        return ans;
    }
}