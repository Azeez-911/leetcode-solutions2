/*
 * LeetCode #9 - Palindrome Number
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 4 ms
 * Memory     : 46.02 MB
 * URL        : https://leetcode.com/problems/palindrome-number/
 */

class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindrome
        // Numbers ending with 0 (except 0) are not palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;

        // Reverse only half of the number
        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        // Even length: x == reversed
        // Odd length: x == reversed/10 (middle digit ignored)
        return x == reversed || x == reversed / 10;
    }
}