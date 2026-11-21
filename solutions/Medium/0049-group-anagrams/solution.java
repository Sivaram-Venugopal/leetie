// ──────────────────────────────────────────────────
// Problem  : 49. Group Anagrams
// Difficulty: Medium
// Tags     : Array, Hash Table, String, Sorting
// Link     : https://leetcode.com/problems/group-anagrams/
// Runtime  : 20 ms (beats 14%)
// Memory   : 50344000 (beats 13%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String s : strs){
        int [] count = new int[26];
        for(char c : s.toCharArray()){
            count[c-'a']++;
        }
        String key = Arrays.toString(count);
        res.putIfAbsent(key , new ArrayList<>());
        res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
        
    }
}