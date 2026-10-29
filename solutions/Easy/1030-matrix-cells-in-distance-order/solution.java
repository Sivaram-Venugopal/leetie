// ──────────────────────────────────────────────────
// Problem  : 1030. Matrix Cells in Distance Order
// Difficulty: Easy
// Tags     : Array, Math, Geometry, Sorting, Matrix
// Link     : https://leetcode.com/problems/matrix-cells-in-distance-order/
// Runtime  : 15 ms (beats 43%)
// Memory   : 47688000 (beats 87%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] cells = new int[rows * cols][2];
        int idx = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                cells[idx][0] = r;
                cells[idx][1] = c;
                idx++;
            }
        }
        Arrays.sort(cells, (a, b) -> {
            int d1 = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int d2 = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return Integer.compare(d1, d2);
        });
        return cells;
    }
}