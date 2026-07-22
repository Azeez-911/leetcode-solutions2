# LeetCode #0 - Maximize Active Section With Trade I
# Difficulty : Unknown
# Language   : python
# Runtime    : 731 ms
# Memory     : 20.68 MB
# URL        : https://leetcode.com/problems/maximize-active-section-with-trade-i/

class Solution:
    def maxActiveSectionsAfterTrade(self, s: str) -> int:
        ans = 0
        pre = float('-inf')
        mx = 0
        i = 0
        n = len(s)

        while i < n:
            j = i
            while j < n and s[j] == s[i]:
                j += 1

            cur = j - i

            if s[i] == '1':
                ans += cur
            else:
                mx = max(mx, pre + cur)
                pre = cur

            i = j

        return ans + mx