/*
 * LeetCode #1 - Two Sum
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 2 ms
 * Memory     : 47.16 MB
 * URL        : https://leetcode.com/problems/two-sum/
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
      Hashtable<Integer, Integer> hashTable = new Hashtable<Integer, Integer>();
      int i = 0;
      while ((i < nums.length) && (hashTable.get(nums[i]) == null)) {      
        hashTable.put(target - nums[i], i);
        i++;
      }
      if (i < nums.length) {
        return new int[]{hashTable.get(nums[i]),i};
      } 
      return null;       
    }
}