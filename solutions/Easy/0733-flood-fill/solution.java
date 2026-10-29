// ──────────────────────────────────────────────────
// Problem  : 733. Flood Fill
// Difficulty: Easy
// Tags     : Array, Depth-First Search, Breadth-First Search, Matrix
// Link     : https://leetcode.com/problems/flood-fill/
// Runtime  : 1 ms (beats 55%)
// Memory   : 46328000 (beats 87%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int origColor = image[sr][sc];
        if (origColor != color) dfs(image, sr, sc, origColor, color);
        return image;
    }
    
    private void dfs(int[][] image, int r, int c, int origColor, int color) {
        if (image[r][c] == origColor) {
            image[r][c] = color;
            if (r >= 1) dfs(image, r - 1, c, origColor, color);
            if (r + 1 < image.length) dfs(image, r + 1, c, origColor, color);
            if (c >= 1) dfs(image, r, c - 1, origColor, color);
            if (c + 1 < image[0].length) dfs(image, r, c + 1, origColor, color);
        }
    }
}