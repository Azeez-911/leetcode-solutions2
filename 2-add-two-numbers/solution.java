/*
 * LeetCode #2 - Add Two Numbers
 * Difficulty : Medium
 * Language   : java
 * Runtime    : 1 ms
 * Memory     : 46.68 MB
 * URL        : https://leetcode.com/problems/add-two-numbers/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { 
 *         this.val = val; 
 *         this.next = next; 
 *     }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        int carry = 0;
        
  