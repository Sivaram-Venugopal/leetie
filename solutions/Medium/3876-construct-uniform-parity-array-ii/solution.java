// ──────────────────────────────────────────────────
// Problem  : 3876. Construct Uniform Parity Array II
// Difficulty: Medium
// Tags     : Array, Math
// Link     : https://leetcode.com/problems/construct-uniform-parity-array-ii/
// Runtime  : 15 ms (beats 21%)
// Memory   : 121872000 (beats 30%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;

        // Check if we can make all even
        if (canMake(nums1, true)) return true;

        // Check if we can make all odd
        if (canMake(nums1, false)) return true;

        return false;
    }

    private boolean canMake(int[] nums, boolean makeEven) {
        // Find the smallest element with required parity
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if ((num % 2 == 0) == makeEven) {
                smallest = Math.min(smallest, num);
            }
        }

        // If no element of required parity exists, fail
        if (smallest == Integer.MAX_VALUE) return false;

        // Try to construct nums2
        for (int num : nums) {
            if ((num % 2 == 0) == makeEven) {
                continue; // already correct parity
            }
            // Use subtraction with smallest element
            int diff = num - smallest;
            if (diff < 1 || (diff % 2 == 0) != makeEven) {
                return false;
            }
        }
        return true;
    }
}
