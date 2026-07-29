# LeetCode #20 - Valid Parentheses
# Difficulty : Easy
# Language   : python
# Runtime    : 0 ms
# Memory     : 19.09 MB
# URL        : https://leetcode.com/problems/valid-parentheses/

class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        pairs = {
            ')': '(',
            '}': '{',
            ']': '['
        }

        for ch in s:
            if ch in "({[":
                stack.append(ch)
            else:
                if not stack or stack[-1] != pairs[ch]:
                    return False
                stack.pop()

        return len(stack) == 0