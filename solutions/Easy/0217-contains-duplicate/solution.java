// ──────────────────────────────────────────────────
// Problem  : 217. Contains Duplicate
// Difficulty: Easy
// Tags     : Array, Hash Table, Sorting
// Link     : https://leetcode.com/problems/contains-duplicate/
// Runtime  : 18 ms (beats 77%)
// Memory   : 107440000 (beats 72%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> seen  = new HashSet<>();
       for(int num : nums){
        if(seen.contains(num)) {
            return true;
        } else {
            seen.add(num);
        }
       
       }
       return false;
}
}