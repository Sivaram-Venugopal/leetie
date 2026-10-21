// ──────────────────────────────────────────────────
// Problem  : 147. Insertion Sort List
// Difficulty: Medium
// Tags     : Linked List, Sorting
// Link     : https://leetcode.com/problems/insertion-sort-list/
// Runtime  : 3 ms (beats 95%)
// Memory   : 46072000 (beats 89%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            if (curr.next != null && curr.next.val < curr.val) {
                ListNode temp = curr.next;
                curr.next = curr.next.next;
                
                ListNode p = dummy;
                while (p.next.val < temp.val) {
                    p = p.next;
                }
                
                temp.next = p.next;
                p.next = temp;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}