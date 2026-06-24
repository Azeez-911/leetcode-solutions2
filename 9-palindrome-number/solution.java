/*
 * LeetCode #9 - Palindrome Number
 * Difficulty : Easy
 * Language   : java
 * Runtime    : N/A
 * Memory     : N/A
 * URL        : https://leetcode.com/problems/palindrome-number/
 */

ing with 0 (except 0) are not palindrome
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