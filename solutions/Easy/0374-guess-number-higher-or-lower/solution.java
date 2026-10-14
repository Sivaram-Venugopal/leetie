// ──────────────────────────────────────────────────
// Problem  : 374. Guess Number Higher or Lower
// Difficulty: Easy
// Tags     : Binary Search, Interactive
// Link     : https://leetcode.com/problems/guess-number-higher-or-lower/
// Runtime  : 0 ms (beats 100%)
// Memory   : 41632000 (beats 96%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long left = 1;
        long right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            int result = guess((int) mid);

            if (result == 0) {
                return (int) mid;
            } else if (result == -1) {
                right = mid - 1; // guess is too high
            } else {
                left = mid + 1;  // guess is too low
            }
        }

        return -1;
    }
}