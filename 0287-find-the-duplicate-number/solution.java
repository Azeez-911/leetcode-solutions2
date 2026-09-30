/*
 * LeetCode #287 - Find the Duplicate Number
 * Difficulty : Medium
 * Language   : java
 * Runtime    : 22 ms
 * Memory     : 91.85 MB
 * URL        : https://leetcode.com/problems/find-the-duplicate-number/
 */

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }

        return 0;
    }
}