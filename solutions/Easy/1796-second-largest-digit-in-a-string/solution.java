// ──────────────────────────────────────────────────
// Problem  : 1796. Second Largest Digit in a String
// Difficulty: Easy
// Tags     : Hash Table, String
// Link     : https://leetcode.com/problems/second-largest-digit-in-a-string/
// Runtime  : 1 ms (beats 97%)
// Memory   : 43712000 (beats 17%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int secondHighest(String s) {
        boolean[] seen = new boolean[10];
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                seen[c - '0'] = true;
            }
        }
        
        int count = 0;
        for (int i = 9; i >= 0; i--) {
            if (seen[i]) {
                count++;
                if (count == 2) return i;
            }
        }
        return -1;
    }
}
