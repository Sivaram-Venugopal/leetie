// ──────────────────────────────────────────────────
// Problem  : 111. Minimum Depth of Binary Tree
// Difficulty: Easy
// Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/minimum-depth-of-binary-tree/
// Runtime  : 6 ms (beats 9%)
// Memory   : 82232000 (beats 17%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // If left subtree is missing
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        // If right subtree is missing
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        return 1 + Math.min(
            minDepth(root.left),
            minDepth(root.right)
        );
    }
}