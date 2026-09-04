// ──────────────────────────────────────────────────
// Problem  : 3903. Smallest Stable Index I
// Difficulty: Easy
// Tags     : Array, Prefix Sum
// Link     : https://leetcode.com/problems/smallest-stable-index-i/
// Runtime  : 1 ms (beats 100%)
// Memory   : 46232000 (beats 71%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // Find prefix max [0..i]
            int prefixMax = nums[0];
            for (int j = 0; j <= i; j++) {
                prefixMax = Math.max(prefixMax, nums[j]);
            }
            
            // Find suffix min [i..n-1]
            int suffixMin = nums[i];
            for (int j = i; j < n; j++) {
                suffixMin = Math.min(suffixMin, nums[j]);
            }
            
            // Instability score
            int instability = prefixMax - suffixMin;
            if (instability <= k) {
                return i;
            }
        }
        
        return -1;
    }
}
