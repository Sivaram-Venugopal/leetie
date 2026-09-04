// ──────────────────────────────────────────────────
// Problem  : 409. Longest Palindrome
// Difficulty: Easy
// Tags     : Hash Table, String, Greedy
// Link     : https://leetcode.com/problems/longest-palindrome/
// Runtime  : 1 ms (beats 100%)
// Memory   : 42908000 (beats 84%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128]; // ASCII
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : freq) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) length += 1;
        return length;
    }
}
