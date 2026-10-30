// ──────────────────────────────────────────────────
// Problem  : 1191. K-Concatenation Maximum Sum
// Difficulty: Medium
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/k-concatenation-maximum-sum/
// Runtime  : 8 ms (beats 12%)
// Memory   : 62568000 (beats 100%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        long MOD = 1_000_000_007;
        long totalSum = 0;
        for (int x : arr) totalSum += x;
        
        long kadane1 = kadane(arr);
        if (k == 1) return (int)(kadane1 % MOD);
        
        int n = arr.length;
        int[] doubleArr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            doubleArr[i] = arr[i % n];
        }
        long kadane2 = kadane(doubleArr);
        
        if (totalSum > 0) {
            long ans = kadane2 + (k - 2) * totalSum;
            return (int)(ans % MOD);
        } else {
            return (int)(kadane2 % MOD);
        }
    }
    
    private long kadane(int[] nums) {
        long maxSoFar = 0, maxCurr = 0;
        for (int x : nums) {
            maxCurr = Math.max(x, maxCurr + x);
            maxSoFar = Math.max(maxSoFar, maxCurr);
        }
        return maxSoFar;
    }
}