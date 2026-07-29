/*
 * LeetCode #20 - Valid Parentheses
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 3 ms
 * Memory     : 43.13 MB
 * URL        : https://leetcode.com/problems/valid-parentheses/
 */

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(' ||
                    ch == '}' && top != '{' ||
                    ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}