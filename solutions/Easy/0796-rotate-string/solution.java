// ──────────────────────────────────────────────────
// Problem  : 796. Rotate String
// Difficulty: Easy
// Tags     : String, String Matching
// Link     : https://leetcode.com/problems/rotate-string/
// Runtime  : 2 ms (beats 64%)
// Memory   : 43528000 (beats 32%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String doubled = s + s;
        return doubled.contains(goal);
    }
}
