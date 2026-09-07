// ──────────────────────────────────────────────────
// Problem  : 78. Subsets
// Difficulty: Medium
// Tags     : Array, Backtracking, Bit Manipulation
// Link     : https://leetcode.com/problems/subsets/
// Runtime  : 1 ms (beats 87%)
// Memory   : 44096000 (beats 75%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
