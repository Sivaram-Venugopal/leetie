// ──────────────────────────────────────────────────
// Problem  : 1927. Sum Game
// Difficulty: Medium
// Tags     : Math, String, Greedy, Game Theory
// Link     : https://leetcode.com/problems/sum-game/
// Runtime  : 7 ms (beats 79%)
// Memory   : 46608000 (beats 95%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int sumDiff = 0; // sum(left) - sum(right)
        int qDiff = 0;   // count('?' in left) - count('?' in right)

        for (int i = 0; i < n / 2; i++) {
            char c = num.charAt(i);
            if (c == '?') {
                qDiff++;
            } else {
                sumDiff += (c - '0');
            }
        }

        for (int i = n / 2; i < n; i++) {
            char c = num.charAt(i);
            if (c == '?') {
                qDiff--;
            } else {
                sumDiff -= (c - '0');
            }
        }

        // If total '?' is odd, Alice gets the final move and can always prevent equality.
        if ((qDiff % 2) != 0) {
            return true;
        }

        // Bob can only ensure equality if each pair of '?' can contribute an average of 9/2 = 4.5.
        // That means: sumDiff + (qDiff / 2) * 9 == 0
        return sumDiff + (qDiff / 2) * 9 != 0;
    }
}