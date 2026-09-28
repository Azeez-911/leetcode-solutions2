/*
 * LeetCode #704 - Binary Search
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 0 ms
 * Memory     : 48.55 MB
 * URL        : https://leetcode.com/problems/binary-search/
 */

class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}