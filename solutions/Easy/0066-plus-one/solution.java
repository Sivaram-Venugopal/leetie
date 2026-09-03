// ──────────────────────────────────────────────────
// Problem  : 66. Plus One
// Difficulty: Easy
// Tags     : Array, Math
// Link     : https://leetcode.com/problems/plus-one/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42676000 (beats 100%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // just increment and return
                return digits;
            }
            digits[i] = 0;     // set to 0 if it was 9
        }

        // If all digits were 9, we need a new array
        int[] result = new int[n + 1];
        result[0] = 1;  // e.g., 999 → 1000
        return result;
    }
}
