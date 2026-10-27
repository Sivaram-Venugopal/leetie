// ──────────────────────────────────────────────────
// Problem  : 101. Symmetric Tree
// Difficulty: Easy
// Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/symmetric-tree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42716000 (beats 98%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        return p.val == q.val
                && isMirror(p.left, q.right)
                && isMirror(p.right, q.left);
    }
}