// ──────────────────────────────────────────────────
// Problem  : 242. Valid Anagram
// Difficulty: Easy
// Tags     : Hash Table, String, Sorting
// Link     : https://leetcode.com/problems/valid-anagram/
// Runtime  : 6 ms (beats 47%)
// Memory   : 43640000 (beats 99%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] freq1= new int[26];
        int[] freq2 = new int[26];
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i) - 'a']++;
            freq2[t.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
}
