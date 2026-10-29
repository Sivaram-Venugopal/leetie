// ──────────────────────────────────────────────────
// Problem  : 384. Shuffle an Array
// Difficulty: Medium
// Tags     : Array, Math, Design, Randomized
// Link     : https://leetcode.com/problems/shuffle-an-array/
// Runtime  : 52 ms (beats 55%)
// Memory   : 51632000 (beats 96%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    private int[] original;
    private Random rand = new Random();

    public Solution(int[] nums) {
        original = nums.clone();
    }

    public int[] reset() {
        return original.clone();
    }

    public int[] shuffle() {
        int[] arr = original.clone();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int x = rand.nextInt(n);
            for(int j = 0; j < n; j++){
                if(i == j){
                    int temp = arr[x];
                    arr[x] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}