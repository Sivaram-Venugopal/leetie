// ──────────────────────────────────────────────────
// Problem  : 945. Minimum Increment to Make Array Unique
// Difficulty: Medium
// Tags     : Array, Greedy, Sorting, Counting
// Link     : https://leetcode.com/problems/minimum-increment-to-make-array-unique/
// Runtime  : 44 ms (beats 41%)
// Memory   : 79248000 (beats 89%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                ans += nums[i - 1] + 1 - nums[i];
                nums[i] = nums[i - 1] + 1;
            }
        }
        return ans;
    }
}