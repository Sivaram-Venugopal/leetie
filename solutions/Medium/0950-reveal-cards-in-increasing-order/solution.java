// ──────────────────────────────────────────────────
// Problem  : 950. Reveal Cards In Increasing Order
// Difficulty: Medium
// Tags     : Array, Queue, Sorting, Simulation
// Link     : https://leetcode.com/problems/reveal-cards-in-increasing-order/
// Runtime  : 8 ms (beats 24%)
// Memory   : 45420000 (beats 76%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> q = new LinkedList<>();
        for (int i = deck.length - 1; i >= 0; i--) {
            if (!q.isEmpty()) {
                q.addFirst(q.pollLast());
            }
            q.addFirst(deck[i]);
        }
        int[] ans = new int[deck.length];
        int idx = 0;
        for (int x : q) ans[idx++] = x;
        return ans;
    }
}