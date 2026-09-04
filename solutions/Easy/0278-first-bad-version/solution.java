// ──────────────────────────────────────────────────
// Problem  : 278. First Bad Version
// Difficulty: Easy
// Tags     : Binary Search, Interactive
// Link     : https://leetcode.com/problems/first-bad-version/
// Runtime  : 13 ms (beats 100%)
// Memory   : 41932000 (beats 73%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
          int left = 1, right = n;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (isBadVersion(mid)) {
            right = mid; // first bad version is at mid or before
        } else {
            left = mid + 1; // first bad version is after mid
        }
    }
    return left; // or right, both converge to the answer
}
}