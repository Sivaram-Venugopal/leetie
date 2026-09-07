// ──────────────────────────────────────────────────
// Problem  : 3471. Find the Largest Almost Missing Integer
// Difficulty: Easy
// Tags     : Array, Hash Table
// Link     : https://leetcode.com/problems/find-the-largest-almost-missing-integer/
// Runtime  : 1 ms (beats 100%)
// Memory   : 44452000 (beats 84%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        
        if (k == 1) {
            // largest element that occurs once
            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : nums) freq.put(num, freq.getOrDefault(num, 0) + 1);
            int ans = -1;
            for (int num : freq.keySet()) {
                if (freq.get(num) == 1) ans = Math.max(ans, num);
            }
            return ans;
        }
        
        if (k == n) {
            // largest element in nums
            int ans = Integer.MIN_VALUE;
            for (int num : nums) ans = Math.max(ans, num);
            return ans;
        }
        
        // Case 3: only first and last elements matter
        int ans = -1;
        int first = nums[0], last = nums[n - 1];
        int countFirst = 0, countLast = 0;
        for (int num : nums) {
            if (num == first) countFirst++;
            if (num == last) countLast++;
        }
        if (countFirst == 1) ans = Math.max(ans, first);
        if (countLast == 1) ans = Math.max(ans, last);
        return ans;
    }
}
