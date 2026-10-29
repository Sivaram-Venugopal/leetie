// ──────────────────────────────────────────────────
// Problem  : 1052. Grumpy Bookstore Owner
// Difficulty: Medium
// Tags     : Array, Sliding Window
// Link     : https://leetcode.com/problems/grumpy-bookstore-owner/
// Runtime  : 3 ms (beats 98%)
// Memory   : 48076000 (beats 95%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) satisfied += customers[i];
        }
        
        int currentExtra = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) currentExtra += customers[i];
        }
        
        int maxExtra = currentExtra;
        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i] == 1) currentExtra += customers[i];
            if (grumpy[i - minutes] == 1) currentExtra -= customers[i - minutes];
            maxExtra = Math.max(maxExtra, currentExtra);
        }
        
        return satisfied + maxExtra;
    }
}