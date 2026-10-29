// ──────────────────────────────────────────────────
// Problem  : 989. Add to Array-Form of Integer
// Difficulty: Easy
// Tags     : Array, Math
// Link     : https://leetcode.com/problems/add-to-array-form-of-integer/
// Runtime  : 3 ms (beats 76%)
// Memory   : 46876000 (beats 99%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            ans.add(k % 10);
            k /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}