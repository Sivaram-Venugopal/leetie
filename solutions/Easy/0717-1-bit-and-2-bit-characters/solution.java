// ──────────────────────────────────────────────────
// Problem  : 717. 1-bit and 2-bit Characters
// Difficulty: Easy
// Tags     : Array
// Link     : https://leetcode.com/problems/1-bit-and-2-bit-characters/
// Runtime  : 0 ms (beats 100%)
// Memory   : 44000000 (beats 88%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0, n = bits.length;
        while (i < n - 1) {
            i += (bits[i] == 0) ? 1 : 2;
        }
        return i == n - 1;
    }
}