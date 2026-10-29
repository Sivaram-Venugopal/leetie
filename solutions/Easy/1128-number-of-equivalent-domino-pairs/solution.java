// ──────────────────────────────────────────────────
// Problem  : 1128. Number of Equivalent Domino Pairs
// Difficulty: Easy
// Tags     : Array, Hash Table, Counting
// Link     : https://leetcode.com/problems/number-of-equivalent-domino-pairs/
// Runtime  : 12 ms (beats 52%)
// Memory   : 55204000 (beats 89%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> count = new HashMap<>();
        int ans = 0;
        for (int[] d : dominoes) {
            int val = Math.min(d[0], d[1]) * 10 + Math.max(d[0], d[1]);
            int prev = count.getOrDefault(val, 0);
            ans += prev;
            count.put(val, prev + 1);
        }
        return ans;
    }
}