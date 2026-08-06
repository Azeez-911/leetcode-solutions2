/*
 * LeetCode #3345 - Smallest Divisible Digit Product I
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 1 ms
 * Memory     : 42.74 MB
 * URL        : https://leetcode.com/problems/smallest-divisible-digit-product-i/
 */

class Solution {
public:
    int smallestNumber(int n, int t) {
        for (int i = n; i <= n + 9; ++i) {
            int product = 1; 
            for (int v = i; v > 0; v /= 10)
                product *= v % 10;
            if (product % t == 0) return i;
        }
        return -1; // unreachable.
    }
};