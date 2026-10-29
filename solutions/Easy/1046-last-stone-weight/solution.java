// ──────────────────────────────────────────────────
// Problem  : 1046. Last Stone Weight
// Difficulty: Easy
// Tags     : Array, Heap (Priority Queue)
// Link     : https://leetcode.com/problems/last-stone-weight/
// Runtime  : 2 ms (beats 34%)
// Memory   : 42352000 (beats 89%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int s : stones) pq.offer(s);
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            if (first != second) {
                pq.offer(first - second);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}