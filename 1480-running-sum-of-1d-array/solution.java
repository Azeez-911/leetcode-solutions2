/*
 * LeetCode #1480 - Running Sum of 1d Array
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 0 ms
 * Memory     : 44.53 MB
 * URL        : https://leetcode.com/problems/running-sum-of-1d-array/
 */

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            arr[i] = sum;
        }

        return arr;
    }
}