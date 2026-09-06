// ──────────────────────────────────────────────────
// Problem  : 1856. Maximum Subarray Min-Product
// Difficulty: Medium
// Tags     : Array, Stack, Monotonic Stack, Prefix Sum, Cartesian Tree
// Link     : https://leetcode.com/problems/maximum-subarray-min-product/
// Runtime  : 75 ms (beats 55%)
// Memory   : 89632000 (beats 55%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        long mod = 1_000_000_007L;

        // Prefix sum
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        // Monotonic stack to find boundaries
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, -1);
        Arrays.fill(right, n);

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                right[stack.pop()] = i;
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek();
            }
            stack.push(i);
        }

        // Compute max product
        long maxProduct = 0;
        for (int i = 0; i < n; i++) {
            int l = left[i] + 1;
            int r = right[i] - 1;
            long sum = prefix[r + 1] - prefix[l];
            maxProduct = Math.max(maxProduct, sum * nums[i]);
        }

        return (int)(maxProduct % mod);
    }
}
