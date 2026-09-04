// ──────────────────────────────────────────────────
// Problem  : 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
// Difficulty: Medium
// Tags     : Linked List
// Link     : https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/
// Runtime  : 9 ms (beats 28%)
// Memory   : 107652000 (beats 27%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> criticalPoints = new ArrayList<>();
        int index = 1; // start from 1 for clarity
        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null && curr.next != null) {
            int nextVal = curr.next.val;
            if ((curr.val > prev.val && curr.val > nextVal) || 
                (curr.val < prev.val && curr.val < nextVal)) {
                criticalPoints.add(index);
            }
            prev = curr;
            curr = curr.next;
            index++;
        }

        if (criticalPoints.size() < 2) return new int[]{-1, -1};

        int minDist = Integer.MAX_VALUE;
        for (int i = 1; i < criticalPoints.size(); i++) {
            minDist = Math.min(minDist, criticalPoints.get(i) - criticalPoints.get(i - 1));
        }

        int maxDist = criticalPoints.get(criticalPoints.size() - 1) - criticalPoints.get(0);

        return new int[]{minDist, maxDist};
    }
}
