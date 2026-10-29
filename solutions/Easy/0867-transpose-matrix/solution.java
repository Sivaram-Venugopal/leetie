// ──────────────────────────────────────────────────
// Problem  : 867. Transpose Matrix
// Difficulty: Easy
// Tags     : Array, Matrix, Simulation
// Link     : https://leetcode.com/problems/transpose-matrix/
// Runtime  : 1 ms (beats 28%)
// Memory   : 46024000 (beats 97%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[][] transpose(int[][] matrix) {
        int R = matrix.length, C = matrix[0].length;
        int[][] ans = new int[C][R];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                ans[c][r] = matrix[r][c];
            }
        }
        return ans;
    }
}