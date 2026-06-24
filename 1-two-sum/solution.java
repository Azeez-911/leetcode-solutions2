/*
 * LeetCode #1 - Two Sum
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 4 ms
 * Memory     : 47.32 MB
 * URL        : https://leetcode.com/problems/two-sum/
 */

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}