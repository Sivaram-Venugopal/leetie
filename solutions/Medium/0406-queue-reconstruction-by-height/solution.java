// ──────────────────────────────────────────────────
// Problem  : 406. Queue Reconstruction by Height
// Difficulty: Medium
// Tags     : Array, Binary Indexed Tree, Segment Tree, Sorting
// Link     : https://leetcode.com/problems/queue-reconstruction-by-height/
// Runtime  : 9 ms (beats 20%)
// Memory   : 46588000 (beats 98%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[][] reconstructQueue(int[][] people) {
	Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

	List<int[]> ordered = new LinkedList<>();
	for (int[] p: people) ordered.add(p[1], p);

	return ordered.toArray(new int[people.length][2]);
}
}