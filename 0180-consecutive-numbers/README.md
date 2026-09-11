# 180. Consecutive Numbers

![Medium](https://img.shields.io/badge/Medium-ffa116?style=flat-square)

**Link:** [leetcode.com/problems/consecutive-numbers/](https://leetcode.com/problems/consecutive-numbers/)

---

## Problem

Table: Logs

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| num         | varchar |
+-------------+---------+
In SQL, id is the primary key for this table.
id is an autoincrement column starting from 1.


 

Find all numbers that appear at least three times consecutively.

Return the result table in any order.

The result format is in the following example.

 
Example 1:

Input: 
Logs table:
+----+-----+
| id | num |
+----+-----+
| 1  | 1   |
| 2  | 1   |
| 3  | 1   |
| 4  | 2   |
| 5  | 1   |
| 6  | 2   |
| 7  | 2   |
+----+-----+
Output: 
+-----------------+
| ConsecutiveNums |
+-----------------+
| 1               |
+-----------------+
Explanation: 1 is the only number that appears consecutively for at least three times.

---

## Stats

| Metric   | Value |
|----------|-------|
| Runtime  | 611 ms |
| Memory   | N/A |
| Language | unknown |
| Solved   | 9/11/2026 |
