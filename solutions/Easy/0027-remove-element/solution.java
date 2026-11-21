// ──────────────────────────────────────────────────
// Problem  : 27. Remove Element
// Difficulty: Easy
// Tags     : Array, Two Pointers
// Link     : https://leetcode.com/problems/remove-element/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42456000 (beats 0%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int num : nums){
            if(nums[num] != val){
                nums[k] = nums[num];
                k++;
            } 
        }
        return k;
    }
}