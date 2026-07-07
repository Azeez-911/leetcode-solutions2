/*
 * LeetCode #3 - Longest Substring Without Repeating Characters
 * Difficulty : Medium
 * Language   : javascript
 * Runtime    : 15 ms
 * Memory     : 60.79 MB
 * URL        : https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    const lastSeen = {};
    let left = 0;
    let maxLen = 0;

    for (let right = 0; right < s.length; right++) {
        const ch = s[right];

        if (ch in lastSeen && lastSeen[ch] >= left) {
            left = lastSeen[ch] + 1;
        }

        lastSeen[ch] = right;
        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
};