# LeetCode #43 - Multiply Strings
# Difficulty : Medium
# Language   : python
# Runtime    : 35 ms
# Memory     : 19.30 MB
# URL        : https://leetcode.com/problems/multiply-strings/

class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        if num1 == "0" or num2 == "0":
            return "0"

        res = [0] * (len(num1) + len(num2))

        for i in range(len(num1) - 1, -1, -1):
            for j in range(len(num2) - 1, -1, -1):
                mul = int(num1[i]) * int(num2[j])

                pos = i + j + 1
                total = mul + res[pos]

                res[pos] = total % 10
                res[pos - 1] += total // 10

        while res[0] == 0:
            res.pop(0)

        return ''.join(map(str, res))