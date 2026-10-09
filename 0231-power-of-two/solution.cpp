/*
 * LeetCode #231 - Power of Two
 * Difficulty : Easy
 * Language   : cpp
 * Runtime    : 0 ms
 * Memory     : 7.94 MB
 * URL        : https://leetcode.com/problems/power-of-two/
 */


class Solution {
public:
    bool isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
};
