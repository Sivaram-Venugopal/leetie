// ──────────────────────────────────────────────────
// Problem  : 4415. Count Values With Equally Spaced Occurrences I
// Difficulty: Easy
// Tags     : N/A
// Link     : https://leetcode.com/problems/count-values-with-equally-spaced-occurrences-i/
// Runtime  : 5 ms (beats 100%)
// Memory   : 46480000 (beats 100%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer , List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        int count = 0;
        for(List<Integer> id : map.values()) {
            if(id.size() == 3){
                if(id.get(1) - id.get(0) == id.get(2) - id.get(1)){
                    count++;
                }
            }
        }
        return count;
    }
}
[1,8,1,5,1,5,8,5]
[8,8,8,8]
[8,6,6,8,8]
[1,8,1,5,1,5,8,5]
[8,8,8,8]
[8,6,6,8,8]
2
0
0