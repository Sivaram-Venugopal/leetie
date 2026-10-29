// ──────────────────────────────────────────────────
// Problem  : 766. Toeplitz Matrix
// Difficulty: Easy
// Tags     : Array, Matrix
// Link     : https://leetcode.com/problems/toeplitz-matrix/
// Runtime  : 1 ms (beats 29%)
// Memory   : 45824000 (beats 93%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length - 1; r++) {
            for (int c = 0; c < matrix[0].length - 1; c++) {
                if (matrix[r][c] != matrix[r + 1][c + 1]) return false;
            }
        }
        return true;
    }
}