// ──────────────────────────────────────────────────
// Problem  : 448. Find All Numbers Disappeared in an Array
// Difficulty: Easy
// Tags     : Array, Hash Table
// Link     : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Runtime  : 6 ms (beats 85%)
// Memory   : 66380000 (beats 100%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Mark visited numbers
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Collect missing numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
