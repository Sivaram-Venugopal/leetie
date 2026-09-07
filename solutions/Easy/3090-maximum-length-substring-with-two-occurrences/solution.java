// ──────────────────────────────────────────────────
// Problem  : 3090. Maximum Length Substring With Two Occurrences
// Difficulty: Easy
// Tags     : Hash Table, String, Sliding Window
// Link     : https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/
// Runtime  : 1 ms (beats 100%)
// Memory   : 43388000 (beats 84%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int[] freq = new int[26];
        int left = 0, maxLen = 0;

        for (int right = 0; right < n; right++) {
            freq[s.charAt(right) - 'a']++;

            while (freq[s.charAt(right) - 'a'] > 2) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
