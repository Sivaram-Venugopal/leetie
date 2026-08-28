// ──────────────────────────────────────────────────
// Problem  : 560. Subarray Sum Equals K
// Difficulty: Medium
// Tags     : Array, Hash Table, Prefix Sum
// Link     : https://leetcode.com/problems/subarray-sum-equals-k/
// Runtime  : 1546 ms (beats 13%)
// Memory   : 48772000 (beats 60%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        // exa = {1,2,3} start = 0(1) , sum = 0
        // end = 0(1) end<3; end++ = end = 1(2)
        //sum = 0 + sum()
        for(int i = 0 ; i < n ; i++){ // start
            int sum = 0;
        
        for(int j = i ; j < n ; j++){
            sum = sum + nums[j];
            if(sum == k){
                count++;
            }
        }
        }
        return count;
        }
}