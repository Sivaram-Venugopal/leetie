// ──────────────────────────────────────────────────
// Problem  : 1929. Concatenation of Array
// Difficulty: Easy
// Tags     : Array, Simulation
// Link     : https://leetcode.com/problems/concatenation-of-array/
// Runtime  : 1 ms (beats 98%)
// Memory   : 47408000 (beats 5%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}