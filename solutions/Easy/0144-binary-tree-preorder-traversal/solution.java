// ──────────────────────────────────────────────────
// Problem  : 144. Binary Tree Preorder Traversal
// Difficulty: Easy
// Tags     : Stack, Tree, Depth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/binary-tree-preorder-traversal/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43408000 (beats 15%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);          // Visit root
        preorder(node.left, result);   // Traverse left
        preorder(node.right, result);  // Traverse right
    }
}