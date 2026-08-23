/*
 * LeetCode #26 - Remove Duplicates from Sorted Array
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 1 ms
 * Memory     : 46.63 MB
 * URL        : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}