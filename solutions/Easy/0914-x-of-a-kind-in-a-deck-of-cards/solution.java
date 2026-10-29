// ──────────────────────────────────────────────────
// Problem  : 914. X of a Kind in a Deck of Cards
// Difficulty: Easy
// Tags     : Array, Hash Table, Math, Counting, Number Theory, Euclidean Algorithm, Greatest Common Divisor
// Link     : https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
// Runtime  : 12 ms (beats 16%)
// Memory   : 46812000 (beats 87%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int c : deck) count.put(c, count.getOrDefault(c, 0) + 1);
        int g = -1;
        for (int freq : count.values()) {
            if (g == -1) g = freq;
            else g = gcd(g, freq);
        }
        return g >= 2;
    }
    
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}