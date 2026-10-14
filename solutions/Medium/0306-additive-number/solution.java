// ──────────────────────────────────────────────────
// Problem  : 306. Additive Number
// Difficulty: Medium
// Tags     : String, Backtracking
// Link     : https://leetcode.com/problems/additive-number/
// Runtime  : 6 ms (beats 15%)
// Memory   : 42868000 (beats 69%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.math.BigInteger;

class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();

        for (int i = 1; i <= n / 2; i++) {
            if (num.charAt(0) == '0' && i > 1) break;

            for (int j = 1; Math.max(i, j) <= n - i - j; j++) {
                if (num.charAt(i) == '0' && j > 1) break;

                BigInteger first = new BigInteger(num.substring(0, i));
                BigInteger second = new BigInteger(num.substring(i, i + j));

                if (isValid(first, second, i + j, num)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isValid(BigInteger a, BigInteger b, int start, String num) {
        while (start < num.length()) {
            BigInteger sum = a.add(b);
            String sumStr = sum.toString();

            if (!num.startsWith(sumStr, start)) {
                return false;
            }

            start += sumStr.length();
            a = b;
            b = sum;
        }

        return true;
    }
}