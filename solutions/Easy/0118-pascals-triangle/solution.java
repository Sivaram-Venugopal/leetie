// ──────────────────────────────────────────────────
// Problem  : 118. Pascal's Triangle
// Difficulty: Easy
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/pascals-triangle/
// Runtime  : 1 ms (beats 96%)
// Memory   : 42964000 (beats 91%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            row.add(1); // first element

            for (int j = 1; j < i; j++) {
                row.add(
                    result.get(i - 1).get(j - 1)
                    + result.get(i - 1).get(j)
                );
            }

            if (i > 0) {
                row.add(1); // last element
            }

            result.add(row);
        }

        return result;
    }
}