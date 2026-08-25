// ──────────────────────────────────────────────────
// Problem  : 3718. Smallest Missing Multiple of K
// Difficulty: Easy
// Tags     : Array, Hash Table
// Link     : https://leetcode.com/problems/smallest-missing-multiple-of-k/
// Runtime  : 2 ms (beats 68%)
// Memory   : 45060000 (beats 71%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int missingMultiple(int[] nums, int k) {
     Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        // Check multiples of k: k, 2k, 3k, ...
        int multiple = k;
        while (set.contains(multiple)) {
            multiple += k;
        }
        
        return multiple;
            }
        }
    
