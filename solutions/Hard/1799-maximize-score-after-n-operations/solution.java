// ──────────────────────────────────────────────────
// Problem  : 1799. Maximize Score After N Operations
// Difficulty: Hard
// Tags     : Array, Math, Dynamic Programming, Backtracking, Bit Manipulation, Number Theory, Bitmask
// Link     : https://leetcode.com/problems/maximize-score-after-n-operations/
// Runtime  : 110 ms (beats 39%)
// Memory   : 47196000 (beats 30%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    int n;
    int[] nums;
    int[][] gcd;
    Map<Integer, Integer> memo = new HashMap<>();

    public int maxScore(int[] nums) {
        this.n = nums.length;
        this.nums = nums;
        this.gcd = new int[n][n];

        // Precompute gcds
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                gcd[i][j] = gcd[j][i] = gcd(nums[i], nums[j]);
            }
        }

        return dfs(1, 0);
    }

    private int dfs(int op, int mask) {
        if (mask == (1 << n) - 1) return 0; // all used
        if (memo.containsKey(mask)) return memo.get(mask);

        int best = 0;
        for (int i = 0; i < n; i++) {
            if ((mask & (1 << i)) != 0) continue;
            for (int j = i + 1; j < n; j++) {
                if ((mask & (1 << j)) != 0) continue;
                int newMask = mask | (1 << i) | (1 << j);
                int score = op * gcd[i][j] + dfs(op + 1, newMask);
                best = Math.max(best, score);
            }
        }
        memo.put(mask, best);
        return best;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
