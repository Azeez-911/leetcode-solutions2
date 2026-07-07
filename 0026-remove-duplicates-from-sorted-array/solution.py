# LeetCode #26 - Remove Duplicates from Sorted Array
# Difficulty : Easy
# Language   : python
# Runtime    : 3 ms
# Memory     : 13.97 MB
# URL        : https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution:
    def removeDuplicates(self, nums):
        if not nums:
            return 0

        k = 1

        for i in range(1, len(nums)):
            if nums[i] != nums[k - 1]:
                nums[k] = nums[i]
                k += 1

        return k