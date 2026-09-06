// ──────────────────────────────────────────────────
// Problem  : 28. Find the Index of the First Occurrence in a String
// Difficulty: Easy
// Tags     : Two Pointers, String, String Matching, Z Algorithm, Knuth–Morris–Pratt Algorithm, Boyer–Moore String-Search Algorithm
// Link     : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Runtime  : 2 ms (beats 14%)
// Memory   : 42684000 (beats 96%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        int n = haystack.length();
        int m = needle.length();

        // Build LPS (Longest Prefix Suffix) array
        int[] lps = new int[m];
        int len = 0, i = 1;
        while (i < m) {
            if (needle.charAt(i) == needle.charAt(len)) {
                lps[i++] = ++len;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i++] = 0;
                }
            }
        }

        // KMP search
        i = 0; // haystack index
        int j = 0; // needle index
        while (i < n) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++; j++;
                if (j == m) return i - j; // found match
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1; // not found
    }
}
