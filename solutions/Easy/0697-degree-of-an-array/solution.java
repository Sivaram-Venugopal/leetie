// ──────────────────────────────────────────────────
// Problem  : 697. Degree of an Array
// Difficulty: Easy
// Tags     : Array, Hash Table
// Link     : https://leetcode.com/problems/degree-of-an-array/
// Runtime  : 26 ms (beats 46%)
// Memory   : 50280000 (beats 35%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>(), right = new HashMap<>(), count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            left.putIfAbsent(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        
        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x : count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }
}