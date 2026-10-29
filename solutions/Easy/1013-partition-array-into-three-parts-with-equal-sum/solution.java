// ──────────────────────────────────────────────────
// Problem  : 1013. Partition Array Into Three Parts With Equal Sum
// Difficulty: Easy
// Tags     : Array, Greedy
// Link     : https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
// Runtime  : 2 ms (beats 54%)
// Memory   : 54764000 (beats 97%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        for (int x : arr) total += x;
        if (total % 3 != 0) return false;
        int target = total / 3;
        int currSum = 0, count = 0;
        for (int x : arr) {
            currSum += x;
            if (currSum == target) {
                count++;
                currSum = 0;
            }
        }
        return count >= 3;
    }
}