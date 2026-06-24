/*
 * LeetCode #66 - Plus One
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 0 ms
 * Memory     : 43.66 MB
 * URL        : https://leetcode.com/problems/plus-one/
 */

class Solution {
    public int[] plusOne(int[] digits) {
        
        for (int i = digits.length - 1; i >= 0; i--) {
            
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }

        // Case: all digits are 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}