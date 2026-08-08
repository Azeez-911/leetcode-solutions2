/*
 * LeetCode #2413 - Smallest Even Multiple
 * Difficulty : Easy
 * Language   : java
 * Runtime    : N/A
 * Memory     : N/A
 * URL        : https://leetcode.com/problems/smallest-even-multiple/
 */

class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        }

        return n * 2;
    }
}