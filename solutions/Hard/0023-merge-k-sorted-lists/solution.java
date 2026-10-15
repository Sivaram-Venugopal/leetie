// ──────────────────────────────────────────────────
// Problem  : 23. Merge k Sorted Lists
// Difficulty: Hard
// Tags     : Linked List, Divide and Conquer, Heap (Priority Queue), Merge Sort, Tournament Sort
// Link     : https://leetcode.com/problems/merge-k-sorted-lists/
// Runtime  : 4 ms (beats 81%)
// Memory   : 46452000 (beats 92%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq =
                new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!pq.isEmpty()) {
            ListNode minNode = pq.poll();

            curr.next = minNode;
            curr = curr.next;

            if (minNode.next != null) {
                pq.offer(minNode.next);
            }
        }

        return dummy.next;
    }
}