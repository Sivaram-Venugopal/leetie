// ──────────────────────────────────────────────────
// Problem  : 594. Longest Harmonious Subsequence
// Difficulty: Easy
// Tags     : Array, Hash Table, Sliding Window, Sorting, Counting
// Link     : https://leetcode.com/problems/longest-harmonious-subsequence/
// Runtime  : 19 ms (beats 15%)
// Memory   : 47356000 (beats 97%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int x : nums) count.put(x, count.getOrDefault(x, 0) + 1);
        int ans = 0;
        for (int x : count.keySet()) {
            if (count.containsKey(x + 1)) {
                ans = Math.max(ans, count.get(x) + count.get(x + 1));
            }
        }
        return ans;
    }
}