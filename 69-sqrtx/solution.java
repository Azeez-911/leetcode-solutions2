/*
 * LeetCode #69 - Sqrt(x)
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 1 ms
 * Memory     : 42.80 MB
 * URL        : https://leetcode.com/problems/sqrtx/
 */

class Solution {
    public int mySqrt(int x) {

        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {   // avoids overflow
                ans = mid;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}