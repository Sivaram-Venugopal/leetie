// ──────────────────────────────────────────────────
// Problem  : 372. Super Pow
// Difficulty: Medium
// Tags     : Math, Divide and Conquer, Euler's Totient Function, Euler's Theorem
// Link     : https://leetcode.com/problems/super-pow/
// Runtime  : 4 ms (beats 75%)
// Memory   : 45844000 (beats 98%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        int result = 1;
        
        for (int digit : b) {
            result = pow(result, 10) * pow(a, digit) % MOD;
        }
        
        return result;
    }

    private int pow(int a, int k) {
        a %= MOD;
        int result = 1;

        while (k > 0) {
            if ((k & 1) == 1) {
                result = result * a % MOD;
            }
            a = a * a % MOD;
            k >>= 1;
        }

        return result;
    }
}