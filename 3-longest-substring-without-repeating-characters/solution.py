# LeetCode #3 - Longest Substring Without Repeating Characters
# Difficulty : Medium
# Language   : python
# Runtime    : 23 ms
# Memory     : 12.63 MB
# URL        : https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution:
    def lengthOfLongestSubstring(self, s):
        last_seen = {}
        left = 0
        max_len = 0
        #hello
        for right, ch in enumerate(s):
            if ch in last_seen and last_seen[ch] >= left:
                left = last_seen[ch] + 1

            last_seen[ch] = right
            max_len = max(max_len, right - left + 1)

        return max_len