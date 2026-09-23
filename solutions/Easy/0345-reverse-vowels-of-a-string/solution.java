// ──────────────────────────────────────────────────
// Problem  : 345. Reverse Vowels of a String
// Difficulty: Easy
// Tags     : Two Pointers, String
// Link     : https://leetcode.com/problems/reverse-vowels-of-a-string/
// Runtime  : 3 ms (beats 62%)
// Memory   : 46364000 (beats 88%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String reverseVowels(String s) {
        // Convert string to char array for easy swapping
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Move left pointer until vowel
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            // Move right pointer until vowel
            while (left < right && !isVowel(arr[right])) {
                right--;
            }
            // Swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
