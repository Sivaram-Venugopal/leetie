// ──────────────────────────────────────────────────
// Problem  : 1170. Compare Strings by Frequency of the Smallest Character
// Difficulty: Medium
// Tags     : Array, Hash Table, String, Binary Search, Sorting
// Link     : https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/
// Runtime  : 6 ms (beats 60%)
// Memory   : 45904000 (beats 96%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] wordFreqs = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            wordFreqs[i] = getFrequency(words[i]);
        }
        Arrays.sort(wordFreqs);
        
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int freq = getFrequency(queries[i]);
            int idx = binarySearchRight(wordFreqs, freq);
            ans[i] = wordFreqs.length - idx;
        }
        return ans;
    }
    
    private int getFrequency(String s) {
        char minChar = 'z' + 1;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c < minChar) {
                minChar = c;
                count = 1;
            } else if (c == minChar) {
                count++;
            }
        }
        return count;
    }
    
    private int binarySearchRight(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > target) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}