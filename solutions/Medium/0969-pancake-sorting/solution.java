// ──────────────────────────────────────────────────
// Problem  : 969. Pancake Sorting
// Difficulty: Medium
// Tags     : Array, Two Pointers, Greedy, Sorting
// Link     : https://leetcode.com/problems/pancake-sorting/
// Runtime  : 1 ms (beats 100%)
// Memory   : 43504000 (beats 85%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int x = n; x > 1; x--) {
            int idx = -1;
            for (int i = 0; i < x; i++) {
                if (arr[i] == x) {
                    idx = i;
                    break;
                }
            }
            if (idx == x - 1) continue;
            if (idx != 0) {
                ans.add(idx + 1);
                reverse(arr, idx + 1);
            }
            ans.add(x);
            reverse(arr, x);
        }
        return ans;
    }
    
    private void reverse(int[] arr, int k) {
        int l = 0, r = k - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}