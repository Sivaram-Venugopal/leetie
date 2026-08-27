// ──────────────────────────────────────────────────
// Problem  : 136. Single Number
// Difficulty: Easy
// Tags     : Array, Bit Manipulation
// Link     : https://leetcode.com/problems/single-number/
// Runtime  : 541 ms (beats 5%)
// Memory   : 47072000 (beats 28%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int count = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
          count = 0;
        for(int j=0;j<n;j++){
            if(nums[i] == nums[j]){
                count++;
            }
        }
         if(count ==1) {
        return nums[i];
        }
       
        } 
        return -1;
    }
}