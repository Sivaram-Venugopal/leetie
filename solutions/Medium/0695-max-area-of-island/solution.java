// ──────────────────────────────────────────────────
// Problem  : 695. Max Area of Island
// Difficulty: Medium
// Tags     : Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix
// Link     : https://leetcode.com/problems/max-area-of-island/
// Runtime  : 3 ms (beats 31%)
// Memory   : 46400000 (beats 67%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int R = grid.length, C = grid[0].length;
        boolean[][] seen = new boolean[R][C];
        int maxArea = 0;
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                maxArea = Math.max(maxArea, dfs(grid, r, c, seen));
            }
        }
        return maxArea;
    }
    
    private int dfs(int[][] grid, int r, int c, boolean[][] seen) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0 || seen[r][c]) {
            return 0;
        }
        seen[r][c] = true;
        return 1 + dfs(grid, r + 1, c, seen) + dfs(grid, r - 1, c, seen) + 
                   dfs(grid, r, c + 1, seen) + dfs(grid, r, c - 1, seen);
    }
}