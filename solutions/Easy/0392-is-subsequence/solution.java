// ──────────────────────────────────────────────────
// Problem  : 392. Is Subsequence
// Difficulty: Easy
// Tags     : Two Pointers, String, Dynamic Programming
// Link     : https://leetcode.com/problems/is-subsequence/
// Runtime  : 2 ms (beats 73%)
// Memory   : 42960000 (beats 28%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
