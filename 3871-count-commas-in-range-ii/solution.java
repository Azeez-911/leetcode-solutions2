/*
 * LeetCode #3871 - Count Commas in Range II
 * Difficulty : Medium
 * Language   : java
 * Runtime    : 1 ms
 * Memory     : 42.65 MB
 * URL        : https://leetcode.com/problems/count-commas-in-range-ii/
 */

class Solution {
    public long countCommas(long n) {
        long ans = 0;
        
        long start = 1000; // first number with a comma
        long commas = 1;

        while (start <= n) {
            long end = start * 1000 - 1;

            if (end > n) {
                end = n;
            }

            ans += (end - start + 1) * commas;

            start *= 1000;
            commas++;
        }

        return ans;
    }
}