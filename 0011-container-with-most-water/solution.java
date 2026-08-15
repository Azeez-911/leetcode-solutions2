/*
 * LeetCode #11 - Container With Most Water
 * Difficulty : Medium
 * Language   : java
 * Runtime    : 5 ms
 * Memory     : 77.44 MB
 * URL        : https://leetcode.com/problems/container-with-most-water/
 */

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;

            int area = h * width;

            max = Math.max(max, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}