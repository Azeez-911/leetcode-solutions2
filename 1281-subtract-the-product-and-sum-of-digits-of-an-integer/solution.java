/*
 * LeetCode #1281 - Subtract the Product and Sum of Digits of an Integer
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 0 ms
 * Memory     : 42.25 MB
 * URL        : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */

class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }

        return product - sum;
    }
}
