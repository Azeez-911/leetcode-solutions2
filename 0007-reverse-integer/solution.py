# LeetCode #7 - Reverse Integer
# Difficulty : Medium
# Language   : python
# Runtime    : 49 ms
# Memory     : 19.22 MB
# URL        : https://leetcode.com/problems/reverse-integer/

class Solution:
    def reverse(self, x: int) -> int:

        sign = -1 if x < 0 else 1
        x = abs(x)

        reversed_num = 0

        while x:

            digit = x % 10
            reversed_num = reversed_num * 10 + digit
            x //= 10

        reversed_num *= sign

        if reversed_num < -2**31 or reversed_num > 2**31 - 1:
            return 0

        return reversed_num