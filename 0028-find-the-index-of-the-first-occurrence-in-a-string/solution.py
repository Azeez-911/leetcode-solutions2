# LeetCode #28 - Find the Index of the First Occurrence in a String
# Difficulty : Easy
# Language   : python
# Runtime    : 0 ms
# Memory     : 12.54 MB
# URL        : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

class Solution:
    def strStr(self, haystack, needle):
        if needle == "":
            return 0

        n = len(needle)

        for i in range(len(haystack) - n + 1):
            if haystack[i:i + n] == needle:
                return i

        return -1