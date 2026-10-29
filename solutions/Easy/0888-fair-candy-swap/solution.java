// ──────────────────────────────────────────────────
// Problem  : 888. Fair Candy Swap
// Difficulty: Easy
// Tags     : Array, Hash Table, Binary Search, Sorting
// Link     : https://leetcode.com/problems/fair-candy-swap/
// Runtime  : 9 ms (beats 64%)
// Memory   : 47708000 (beats 96%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        Set<Integer> setB = new HashSet<>();
        for (int x : aliceSizes) sumA += x;
        for (int y : bobSizes) {
            sumB += y;
            setB.add(y);
        }
        int diff = (sumB - sumA) / 2;
        for (int x : aliceSizes) {
            if (setB.contains(x + diff)) {
                return new int[]{x, x + diff};
            }
        }
        return new int[0];
    }
}