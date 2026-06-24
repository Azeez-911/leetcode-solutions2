/*
 * LeetCode #21 - Merge Two Sorted Lists
 * Difficulty : Easy
 * Language   : java
 * Runtime    : N/A
 * Memory     : N/A
 * URL        : https://leetcode.com/problems/merge-two-sorted-lists/
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && lis