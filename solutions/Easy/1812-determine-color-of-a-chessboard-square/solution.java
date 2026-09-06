// ──────────────────────────────────────────────────
// Problem  : 1812. Determine Color of a Chessboard Square
// Difficulty: Easy
// Tags     : Math, String
// Link     : https://leetcode.com/problems/determine-color-of-a-chessboard-square/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42492000 (beats 86%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean squareIsWhite(String coordinates) {
        int col = coordinates.charAt(0) - 'a' + 1; // convert letter to number
        int row = coordinates.charAt(1) - '0';     // numeric row
        return (col + row) % 2 == 1; // odd → white
    }
}
