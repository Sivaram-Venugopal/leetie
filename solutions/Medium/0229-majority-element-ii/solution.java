// ──────────────────────────────────────────────────
// Problem  : 229. Majority Element II
// Difficulty: Medium
// Tags     : Array, Hash Table, Sorting, Counting, Boyer–Moore Majority Vote Algorithm
// Link     : https://leetcode.com/problems/majority-element-ii/
// Runtime  : 935 ms (beats 5%)
// Memory   : 52324000 (beats 75%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (seen.contains(nums[i])) continue;
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) count++;
            }
            if (count > n / 3) {
                result.add(nums[i]);
            }
            seen.add(nums[i]);
        }
        return result;
    }
}
