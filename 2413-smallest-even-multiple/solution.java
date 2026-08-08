/*
 * LeetCode #2413 - Smallest Even Multiple
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 0 ms
 * Memory     : 42.03 MB
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