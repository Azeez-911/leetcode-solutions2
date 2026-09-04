/*
 * LeetCode #3903 - Smallest Stable Index I
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 1 ms
 * Memory     : 46.59 MB
 * URL        : https://leetcode.com/problems/smallest-stable-index-i/
 */

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int max = nums[0];

            // Find max from 0 to i
            for (int j = 0; j <= i; j++) {
                max = Math.max(max, nums[j]);
            }

            int min = nums[i];

            // Find min from i to n-1
            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
            }

            if (max - min <= k) {
                return i;
            }
        }

        return -1;
    }
}