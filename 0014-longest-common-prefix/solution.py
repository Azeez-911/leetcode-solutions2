# LeetCode #14 - Longest Common Prefix
# Difficulty : Easy
# Language   : python
# Runtime    : 0 ms
# Memory     : 12.38 MB
# URL        : https://leetcode.com/problems/longest-common-prefix/

class Solution:
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if len(strs) == 0:
            return '' 
        res = ''
        strs = sorted(strs)
        for i in strs[0]:
            if strs[-1].startswith(res+i):
                res += i
            else:
                break
        return res