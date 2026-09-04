// ──────────────────────────────────────────────────
// Problem  : 2155. All Divisions With the Highest Score of a Binary Array
// Difficulty: Medium
// Tags     : Array
// Link     : https://leetcode.com/problems/all-divisions-with-the-highest-score-of-a-binary-array/
// Runtime  : 17 ms (beats 80%)
// Memory   : 252820000 (beats 39%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int n = nums.length;
        int totalOnes = 0;
        for (int num : nums) {
            if (num == 1) totalOnes++;
        }

        List<Integer> result = new ArrayList<>();
        int maxScore = Integer.MIN_VALUE;
        int zerosLeft = 0;
        int onesRight = totalOnes;

        for (int i = 0; i <= n; i++) {
            int score = zerosLeft + onesRight;

            if (score > maxScore) {
                maxScore = score;
                result.clear();
                result.add(i);
            } else if (score == maxScore) {
                result.add(i);
            }

            // update counts for next division
            if (i < n) {
                if (nums[i] == 0) zerosLeft++;
                else onesRight--;
            }
        }

        return result;
    }
}
