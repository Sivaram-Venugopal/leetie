// ──────────────────────────────────────────────────
// Problem  : 1929. Concatenation of Array
// Difficulty: Easy
// Tags     : Array, Simulation
// Link     : https://leetcode.com/problems/concatenation-of-array/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42424000 (beats 0%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = nums[i];
            
        }
        return arr;
    }
}