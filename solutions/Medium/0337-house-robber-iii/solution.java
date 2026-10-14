// ──────────────────────────────────────────────────
// Problem  : 337. House Robber III
// Difficulty: Medium
// Tags     : Dynamic Programming, Tree, Depth-First Search, Binary Tree, DP on Trees
// Link     : https://leetcode.com/problems/house-robber-iii/
// Runtime  : 1 ms (beats 42%)
// Memory   : 46196000 (beats 95%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int rob(TreeNode root) {
        int[] ans = dfs(root);
        return Math.max(ans[0], ans[1]);
    }

    private int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        int rob = node.val + left[1] + right[1];

        int notRob = Math.max(left[0], left[1]) +
                     Math.max(right[0], right[1]);

        return new int[]{rob, notRob};
    }
}