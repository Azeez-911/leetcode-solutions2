/*
 * LeetCode #2119 - A Number After a Double Reversal
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 0 ms
 * Memory     : 42.15 MB
 * URL        : https://leetcode.com/problems/a-number-after-a-double-reversal/
 */

class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num>=10){
            if(num%10==0){
            return false;
        }
        }
        return true;
        
    }
    
}