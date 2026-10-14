// ──────────────────────────────────────────────────
// Problem  : 405. Convert a Number to Hexadecimal
// Difficulty: Easy
// Tags     : Math, String, Bit Manipulation
// Link     : https://leetcode.com/problems/convert-a-number-to-hexadecimal/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42244000 (beats 95%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] hex = {
            '0', '1', '2', '3',
            '4', '5', '6', '7',
            '8', '9', 'a', 'b',
            'c', 'd', 'e', 'f'
        };

        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            sb.append(hex[num & 15]); // last 4 bits
            num >>>= 4;               // unsigned right shift
        }

        return sb.reverse().toString();
    }
}