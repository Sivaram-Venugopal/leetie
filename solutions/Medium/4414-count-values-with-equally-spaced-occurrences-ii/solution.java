// ──────────────────────────────────────────────────
// Problem  : 4414. Count Values With Equally Spaced Occurrences II
// Difficulty: Medium
// Tags     : N/A
// Link     : https://leetcode.com/problems/count-values-with-equally-spaced-occurrences-ii/
// Runtime  : 114 ms (beats 67%)
// Memory   : 247320000 (beats 100%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int countSpecialIntegers(int[] nums) {
        int [] abc = nums;
        Map<Integer , List<Integer>> map = new HashMap<>();
        for(int i=0;i<abc.length;i++){
            map.computeIfAbsent(abc[i], k-> new ArrayList<>()).add(i);
        }
        int count = 0;
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> id = entry.getValue();
            if(id.size() >= 3){
                boolean spa = true;
                int diff = id.get(1) - id.get(0);
                for(int i=2;i < id.size();i++){
                if(id.get(i) - id.get(i-1) != diff){
                    spa = false;
                    break;
                }
                }
                if(spa){
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
1
0