/*
 * LeetCode #33 - Search in Rotated Sorted Array
 * Difficulty : Medium
 * Language   : java
 * Runtime    : 0 ms
 * Memory     : 43.69 MB
 * URL        : https://leetcode.com/problems/search-in-rotated-sorted-array/
 */

// class Solution {
//     public int search(int[] nums, int target) {
//         int low=0,high=nums.length-1;
//         int mid;
//         while(low<=high){
//             mid=low+(high-low)/2;
//             if(nums[mid]==target){
//                 high=mid-1;
//                 return mid;
//             }
//             else if(nums[mid]>target){
                
//                 if(nums[low]>target){
//                     low=mid+1;
//                     continue;
//                 }
                
//                 high=mid-1;
//                 //low=mid+1;
            
//             }
            
//             else{
//                 //  if(nums[low]>target){
//                 //     high=mid-1;
//                 //     continue;
//                 // }
//                  low=mid+1;
//             }
//         }
//         return -1;
//     }
// }
class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;

            // Left half is sorted
            if (nums[low] <= nums[mid]) {

                if (nums[low] <= target && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }

            // Right half is sorted
            else {

                if (nums[mid] < target && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }
}