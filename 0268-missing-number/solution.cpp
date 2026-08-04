/*
 * LeetCode #268 - Missing Number
 * Difficulty : Easy
 * Language   : cpp
 * Runtime    : N/A
 * Memory     : N/A
 * URL        : https://leetcode.com/problems/missing-number/
 */

class Solution {
    public int missingNumber(int[] nums) {
        // int l = nums.length;
        // int sum=0;
        // for(int i=0;i<l;i++){
        //     sum+=nums[i];
        // }
        // int r = (l*(l+1))/2-sum;
        // return r;
        Arrays.sort(nums);
        int i = 0;
        for (int num : nums){
            if(num != i){
                return i;
            }
            i++;
        }

        return nums.length;
    }
}