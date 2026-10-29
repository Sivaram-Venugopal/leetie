// ──────────────────────────────────────────────────
// Problem  : 849. Maximize Distance to Closest Person
// Difficulty: Medium
// Tags     : Array
// Link     : https://leetcode.com/problems/maximize-distance-to-closest-person/
// Runtime  : 2 ms (beats 100%)
// Memory   : 46968000 (beats 95%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxDistToClosest(int[] seats) {
        int ans = 0, last = -1, n = seats.length;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                if (last == -1) {
                    ans = i;
                } else {
                    ans = Math.max(ans, (i - last) / 2);
                }
                last = i;
            }
        }
        ans = Math.max(ans, n - 1 - last);
        return ans;
    }
}