// ──────────────────────────────────────────────────
// Problem  : 290. Word Pattern
// Difficulty: Easy
// Tags     : Hash Table, String
// Link     : https://leetcode.com/problems/word-pattern/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42692000 (beats 73%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> mapChar = new HashMap<>();
        Map<String, Character> mapWord = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (mapChar.containsKey(c) && !mapChar.get(c).equals(w)) return false;
            if (mapWord.containsKey(w) && mapWord.get(w) != c) return false;

            mapChar.put(c, w);
            mapWord.put(w, c);
        }
        return true;
    }
}
