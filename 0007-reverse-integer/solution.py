# LeetCode #7 - Reverse Integer
# Difficulty : Medium
# Language   : python
# Runtime    : 41 ms
# Memory     : 19.14 MB
# URL        : https://leetcode.com/problems/reverse-integer/

class Solution:
    def reverse(self, x: int) -> int:

        sign = -1 if x < 0 else 1

        reversed_num = int(str(abs(x))[::-1]) * sign

        if reversed_num < -2**31 or reversed_num > 2**31 - 1:
            return 0

        return reversed_num