// ──────────────────────────────────────────────────
// Problem  : 473. Matchsticks to Square
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Backtracking, Bit Manipulation, Bitmask
// Link     : https://leetcode.com/problems/matchsticks-to-square/
// Runtime  : 110 ms (beats 31%)
// Memory   : 43168000 (beats 69%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────



class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for (int stick : matchsticks) {
            sum += stick;
        }
        if (sum % 4 != 0) return false;
        int side = sum / 4;

        Arrays.sort(matchsticks);
        // Sort descending for better pruning
        for (int i = 0, j = matchsticks.length - 1; i < j; i++, j--) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }

        int[] sides = new int[4];
        return dfs(matchsticks, 0, sides, side);
    }

    private boolean dfs(int[] sticks, int index, int[] sides, int target) {
        if (index == sticks.length) {
            return sides[0] == target && sides[1] == target &&
                   sides[2] == target && sides[3] == target;
        }

        for (int i = 0; i < 4; i++) {
            if (sides[i] + sticks[index] <= target) {
                sides[i] += sticks[index];
                if (dfs(sticks, index + 1, sides, target)) return true;
                sides[i] -= sticks[index];
            }
        }
        return false;
    }
}
