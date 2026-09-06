// ──────────────────────────────────────────────────
// Problem  : 1817. Finding the Users Active Minutes
// Difficulty: Medium
// Tags     : Array, Hash Table
// Link     : https://leetcode.com/problems/finding-the-users-active-minutes/
// Runtime  : 18 ms (beats 66%)
// Memory   : 92220000 (beats 16%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();

        // Build user → set of minutes
        for (int[] log : logs) {
            int user = log[0], minute = log[1];
            map.putIfAbsent(user, new HashSet<>());
            map.get(user).add(minute);
        }

        int[] result = new int[k];
        // Count users by their UAM
        for (Set<Integer> minutes : map.values()) {
            int uam = minutes.size();
            result[uam - 1]++;
        }

        return result;
    }
}
