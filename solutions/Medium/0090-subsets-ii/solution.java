// ──────────────────────────────────────────────────
// Problem  : 90. Subsets II
// Difficulty: Medium
// Tags     : Array, Backtracking, Bit Manipulation
// Link     : https://leetcode.com/problems/subsets-ii/
// Runtime  : 3 ms (beats 54%)
// Memory   : 44848000 (beats 89%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        backtrack(0, nums, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int start, int[] nums,
                           List<Integer> current,
                           List<List<Integer>> result) {

        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {

            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            current.add(nums[i]);
            backtrack(i + 1, nums, current, result);
            current.remove(current.size() - 1);
        }
    }
}