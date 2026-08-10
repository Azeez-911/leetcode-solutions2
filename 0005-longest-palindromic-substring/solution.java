/*
 * LeetCode #5 - Longest Palindromic Substring
 * Difficulty : Medium
 * Language   : java
 * Runtime    : 15 ms
 * Memory     : 43.71 MB
 * URL        : https://leetcode.com/problems/longest-palindromic-substring/
 */

class Solution {
    public String longestPalindrome(String s) {

        if (s.length() < 2) {
            return s;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int len1 = expand(s, i, i);

            // Even length palindrome
            int len2 = expand(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    public int expand(String s, int left, int right) {

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }
}