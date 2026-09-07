// ──────────────────────────────────────────────────
// Problem  : 2833. Furthest Point From Origin
// Difficulty: Easy
// Tags     : String, Counting
// Link     : https://leetcode.com/problems/furthest-point-from-origin/
// Runtime  : 1 ms (beats 100%)
// Memory   : 43852000 (beats 46%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0, countR = 0, count_ = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'L') countL++;
            else if (c == 'R') countR++;
            else count_++;
        }
        return Math.max(Math.abs(countL + count_ - countR),
                        Math.abs(countR + count_ - countL));
    }
}
