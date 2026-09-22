// ──────────────────────────────────────────────────
// Problem  : 257. Binary Tree Paths
// Difficulty: Easy
// Tags     : String, Backtracking, Tree, Depth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/binary-tree-paths/
// Runtime  : 4 ms (beats 72%)
// Memory   : 49632000 (beats 47%)
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
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            dfs(root, "", paths);
        }
        return paths;
    }

    private void dfs(TreeNode node, String path, List<String> paths) {
        if (node.left == null && node.right == null) {
            paths.add(path + node.val);
        } else {
            if (node.left != null) {
                dfs(node.left, path + node.val + "->", paths);
            }
            if (node.right != null) {
                dfs(node.right, path + node.val + "->", paths);
            }
        }
    }
}
