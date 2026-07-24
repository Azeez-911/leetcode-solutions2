# LeetCode #29 - Divide Two Integers
# Difficulty : Medium
# Language   : python
# Runtime    : 0 ms
# Memory     : 18.92 MB
# URL        : https://leetcode.com/problems/divide-two-integers/

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        a = int(dividend/divisor)
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31

        if a > INT_MAX:
            return INT_MAX

        if a < INT_MIN:
            return INT_MIN
        return a