/*
 * LeetCode #3731 - Find Missing Elements
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 3 ms
 * Memory     : 46.56 MB
 * URL        : https://leetcode.com/problems/find-missing-elements/
 */

import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}