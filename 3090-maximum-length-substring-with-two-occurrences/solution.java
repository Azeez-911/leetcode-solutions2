/*
 * LeetCode #3090 - Maximum Length Substring With Two Occurrences
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 1 ms
 * Memory     : 43.59 MB
 * URL        : https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/
 */

class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count = new int[26];

        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            count[s.charAt(right) - 'a']++;

            while (count[s.charAt(right) - 'a'] > 2) {
                count[s.charAt(left) - 'a']--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}