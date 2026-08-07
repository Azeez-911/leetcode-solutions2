/*
 * LeetCode #2520 - Count the Digits That Divide a Number
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 0 ms
 * Memory     : 42.08 MB
 * URL        : https://leetcode.com/problems/count-the-digits-that-divide-a-number/
 */

class Solution {
    public int countDigits(int num) {
        int c=0;
        int temp=num;
        while(num>0){
            int di=num%10;
            if(temp%di==0){
                c++;
            }
            num=num/10;
        }
        return c;
        
    }
}