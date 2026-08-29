// ──────────────────────────────────────────────────
// Problem  : 560. Subarray Sum Equals K
// Difficulty: Medium
// Tags     : Array, Hash Table, Prefix Sum
// Link     : https://leetcode.com/problems/subarray-sum-equals-k/
// Runtime  : 1528 ms (beats 24%)
// Memory   : 48760000 (beats 60%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            int sum= 0;
            for(int j=i;j<nums.length;j++){
                sum = sum + nums[j];
            
            if(sum == k){
                cnt++; 
             }
        }
        }
        return cnt++;
    }
}