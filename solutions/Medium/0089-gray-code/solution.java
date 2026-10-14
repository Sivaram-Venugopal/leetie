// ──────────────────────────────────────────────────
// Problem  : 89. Gray Code
// Difficulty: Medium
// Tags     : Math, Backtracking, Bit Manipulation
// Link     : https://leetcode.com/problems/gray-code/
// Runtime  : 5 ms (beats 55%)
// Memory   : 53356000 (beats 85%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();

        int size = 1 << n; // 2^n

        for (int i = 0; i < size; i++) {
            ans.add(i ^ (i >> 1));
        }

        return ans;
    }
}