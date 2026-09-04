// ──────────────────────────────────────────────────
// Problem  : 464. Can I Win
// Difficulty: Medium
// Tags     : Math, Dynamic Programming, Bit Manipulation, Memoization, Game Theory, Bitmask
// Link     : https://leetcode.com/problems/can-i-win/
// Runtime  : 320 ms (beats 49%)
// Memory   : 107268000 (beats 52%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    Map<Integer, Boolean> memo = new HashMap<>();
    int maxChoosableInteger;
    int desiredTotal;

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        this.maxChoosableInteger = maxChoosableInteger;
        this.desiredTotal = desiredTotal;

        int sum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
        if (sum < desiredTotal) return false; // impossible
        if (desiredTotal <= 0) return true;   // trivially true

        return dfs(0, 0);
    }

    private boolean dfs(int usedMask, int currentTotal) {
        if (memo.containsKey(usedMask)) return memo.get(usedMask);

        for (int i = 1; i <= maxChoosableInteger; i++) {
            int bit = 1 << i;
            if ((usedMask & bit) == 0) { // number not used
                if (currentTotal + i >= desiredTotal ||
                    !dfs(usedMask | bit, currentTotal + i)) {
                    memo.put(usedMask, true);
                    return true;
                }
            }
        }
        memo.put(usedMask, false);
        return false;
    }
}
