// ──────────────────────────────────────────────────
// Problem  : 100. Same Tree
// Difficulty: Easy
// Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/same-tree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42752000 (beats 71%)
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
         if (p == null && q == null) return true;
        
        // If one is null and the other is not, they are different
        if (p == null || q == null) return false;
        
        // If values differ, trees are not the same
        if (p.val != q.val) return false;
        
        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}