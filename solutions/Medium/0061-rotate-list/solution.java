// ──────────────────────────────────────────────────
// Problem  : 61. Rotate List
// Difficulty: Medium
// Tags     : Linked List, Two Pointers
// Link     : https://leetcode.com/problems/rotate-list/
// Runtime  : 0 ms (beats 100%)
// Memory   : 44400000 (beats 44%)
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Find length and tail
        int n = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        // Make circular
        tail.next = head;

        // Find new head
        int stepsToNewHead = n - (k % n);
        ListNode newTail = tail;
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }

        // Break cycle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

}