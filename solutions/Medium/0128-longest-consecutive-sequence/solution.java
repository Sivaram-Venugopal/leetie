// ──────────────────────────────────────────────────
// Problem  : 128. Longest Consecutive Sequence
// Difficulty: Medium
// Tags     : Array, Hash Table, Union-Find
// Link     : https://leetcode.com/problems/longest-consecutive-sequence/
// Runtime  : 33 ms (beats 27%)
// Memory   : 95252000 (beats 64%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}