/*
 * LeetCode #100 - Same Tree
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 0 ms
 * Memory     : 43.05 MB
 * URL        : https://leetcode.com/problems/same-tree/
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}