/*
 * LeetCode #3903 - Smallest Stable Index I
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 1 ms
 * Memory     : 46.25 MB
 * URL        : https://leetcode.com/problems/smallest-stable-index-i/
 */

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        // Stores minimum from i to n-1
        int[] right = new int[n];

        right[n - 1] = nums[n - 1];

        // Build suffix minimum array
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.min(nums[i], right[i + 1]);
        }

        // Stores maximum from 0 to i
        int leftMax = 0;

        // Find smallest stable index
        for (int i = 0; i < n; i++) {
            leftMax = Math.max(leftMax, nums[i]);

            if (leftMax - right[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}