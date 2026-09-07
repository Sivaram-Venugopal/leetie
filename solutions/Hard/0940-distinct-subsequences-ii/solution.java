// ──────────────────────────────────────────────────
// Problem  : 940. Distinct Subsequences II
// Difficulty: Hard
// Tags     : String, Dynamic Programming
// Link     : https://leetcode.com/problems/distinct-subsequences-ii/
// Runtime  : 4 ms (beats 71%)
// Memory   : 43724000 (beats 28%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1_000_000_007;
        int n = s.length();
        long[] dp = new long[n + 1];
        dp[0] = 1; // empty subsequence
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for (int i = 1; i <= n; i++) {
            int c = s.charAt(i - 1) - 'a';
            dp[i] = (dp[i - 1] * 2) % MOD;
            if (last[c] != -1) {
                dp[i] = (dp[i] - dp[last[c] - 1] + MOD) % MOD;
            }
            last[c] = i;
        }
        return (int)((dp[n] - 1 + MOD) % MOD); // exclude empty subsequence
    }
}
