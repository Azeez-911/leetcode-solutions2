/*
 * LeetCode #34 - Find First and Last Position of Element in Sorted Array
 * Difficulty : Medium
 * Language   : java
 * Runtime    : 0 ms
 * Memory     : 48.40 MB
 * URL        : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int first=-1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        low=0;
        high=nums.length-1;
        mid=0;
        int last=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(target==nums[mid]){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        //System.out.print(first +" "+ last);
        return new int[]{first,last};
    }
}