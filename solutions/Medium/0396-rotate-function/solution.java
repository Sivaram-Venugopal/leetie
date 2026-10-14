// ──────────────────────────────────────────────────
// Problem  : 396. Rotate Function
// Difficulty: Medium
// Tags     : Array, Math, Dynamic Programming
// Link     : https://leetcode.com/problems/rotate-function/
// Runtime  : 4 ms (beats 99%)
// Memory   : 90648000 (beats 98%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;

        long sum = 0;
        long f = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            f += (long) i * nums[i];
        }

        long ans = f;

        for (int k = 1; k < n; k++) {
            f = f + sum - (long) n * nums[n - k];
            ans = Math.max(ans, f);
        }

        return (int) ans;
    }
}