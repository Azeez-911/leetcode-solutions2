# LeetCode #50 - Pow(x, n)
# Difficulty : Medium
# Language   : python
# Runtime    : 0 ms
# Memory     : 12.40 MB
# URL        : https://leetcode.com/problems/powx-n/

class Solution:
    def myPow(self, x, n):
        if n < 0:
            x = 1 / x
            n = -n

        ans = 1

        while n > 0:
            if n & 1:
                ans *= x

            x *= x
            n >>= 1

        return ans
        