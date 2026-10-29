// ──────────────────────────────────────────────────
// Problem  : 999. Available Captures for Rook
// Difficulty: Easy
// Tags     : Array, Matrix, Simulation
// Link     : https://leetcode.com/problems/available-captures-for-rook/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42264000 (beats 88%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numRookCaptures(char[][] board) {
        int rx = 0, ry = 0;
        outer: for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                if (board[r][c] == 'R') {
                    rx = r;
                    ry = c;
                    break outer;
                }
            }
        }
        
        int ans = 0;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] d : dirs) {
            int x = rx + d[0], y = ry + d[1];
            while (x >= 0 && x < 8 && y >= 0 && y < 8) {
                if (board[x][y] == 'p') {
                    ans++;
                    break;
                } else if (board[x][y] == 'B') {
                    break;
                }
                x += d[0];
                y += d[1];
            }
        }
        return ans;
    }
}