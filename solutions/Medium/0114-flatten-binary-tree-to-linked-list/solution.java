// ──────────────────────────────────────────────────
// Problem  : 114. Flatten Binary Tree to Linked List
// Difficulty: Medium
// Tags     : Linked List, Stack, Tree, Depth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
// Runtime  : 1 ms (beats 19%)
// Memory   : 43260000 (beats 97%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public void flatten(TreeNode root) {
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left != null) {
                TreeNode prev = curr.left;

                while (prev.right != null) {
                    prev = prev.right;
                }

                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }

            curr = curr.right;
        }
    }
}