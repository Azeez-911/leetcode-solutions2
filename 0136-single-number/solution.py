# LeetCode #136 - Single Number
# Difficulty : Easy
# Language   : python
# Runtime    : 0 ms
# Memory     : 14.02 MB
# URL        : https://leetcode.com/problems/single-number/

class Solution(object):
    def singleNumber(self, nums):
        ans = 0
        for num in nums:
            ans ^=num
        return ans
        