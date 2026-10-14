// ──────────────────────────────────────────────────
// Problem  : 299. Bulls and Cows
// Difficulty: Medium
// Tags     : Hash Table, String, Counting
// Link     : https://leetcode.com/problems/bulls-and-cows/
// Runtime  : 4 ms (beats 45%)
// Memory   : 42860000 (beats 100%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;

        int[] count = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if (s == g) {
                bulls++;
            } else {
                if (count[s - '0'] < 0) cows++;
                if (count[g - '0'] > 0) cows++;

                count[s - '0']++;
                count[g - '0']--;
            }
        }

        return bulls + "A" + cows + "B";
    }
}