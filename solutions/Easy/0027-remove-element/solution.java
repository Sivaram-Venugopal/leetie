// ──────────────────────────────────────────────────
// Problem  : 27. Remove Element
// Difficulty: Easy
// Tags     : Array, Two Pointers
// Link     : https://leetcode.com/problems/remove-element/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42900000 (beats 88%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int num=0 ; num < nums.length; num++){
            if(nums[num] != val){
                nums[k] = nums[num];
                k++;
            } 
        }
        return k;
    }
}