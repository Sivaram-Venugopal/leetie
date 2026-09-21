// ──────────────────────────────────────────────────
// Problem  : 395. Longest Substring with At Least K Repeating Characters
// Difficulty: Medium
// Tags     : Hash Table, String, Divide and Conquer, Sliding Window
// Link     : https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
// Runtime  : 55 ms (beats 47%)
// Memory   : 44284000 (beats 44%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int longestSubstring(String s, int k) {
        return helper(s, 0, s.length(), k);
    }

    private int helper(String s, int start, int end, int k) {
        if (end - start < k) return 0; // too short to be valid

        // Count frequency of each character
        int[] freq = new int[26];
        for (int i = start; i < end; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Split around invalid characters
        for (int i = start; i < end; i++) {
            if (freq[s.charAt(i) - 'a'] < k) {
                int left = helper(s, start, i, k);
                int right = helper(s, i + 1, end, k);
                return Math.max(left, right);
            }
        }

        // If all characters are valid
        return end - start;
    }
}
