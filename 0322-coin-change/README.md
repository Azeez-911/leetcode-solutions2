# 322. Coin Change

![Medium](https://img.shields.io/badge/Medium-ffa116?style=flat-square)

**Link:** [leetcode.com/problems/coin-change/](https://leetcode.com/problems/coin-change/)

---

## Problem

You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

 
Example 1:

Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1


Example 2:

Input: coins = [2], amount = 3
Output: -1


Example 3:

Input: coins = [1], amount = 0
Output: 0


 
Constraints:


	1 <= coins.length <= 12
	1 <= coins[i] <= 231 - 1
	0 <= amount <= 104

---

## Stats

| Metric   | Value |
|----------|-------|
| Runtime  | 423 ms |
| Memory   | 19.50 MB |
| Language | python |
| Solved   | 7/25/2026 |
