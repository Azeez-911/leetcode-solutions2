/*
 * LeetCode #9 - Palindrome Number
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 0 ms
 * Memory     : 8.68 MB
 * URL        : https://leetcode.com/problems/palindrome-number/
 */

class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0)
            return false;

        int original = x;
        long long reversed = 0;

        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return original == reversed;
    }
};