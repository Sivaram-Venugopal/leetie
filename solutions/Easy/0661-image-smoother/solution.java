// ──────────────────────────────────────────────────
// Problem  : 661. Image Smoother
// Difficulty: Easy
// Tags     : Array, Matrix
// Link     : https://leetcode.com/problems/image-smoother/
// Runtime  : 6 ms (beats 71%)
// Memory   : 47484000 (beats 81%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[][] imageSmoother(int[][] img) {
        int R = img.length, C = img[0].length;
        int[][] ans = new int[R][C];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                int cnt = 0, total = 0;
                for (int nr = r - 1; nr <= r + 1; nr++) {
                    for (int nc = c - 1; nc <= c + 1; nc++) {
                        if (nr >= 0 && nr < R && nc >= 0 && nc < C) {
                            total += img[nr][nc];
                            cnt++;
                        }
                    }
                }
                ans[r][c] = total / cnt;
            }
        }
        return ans;
    }
}