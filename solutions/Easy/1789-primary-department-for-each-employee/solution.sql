-- ──────────────────────────────────────────────────
-- Problem  : 1789. Primary Department for Each Employee
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/primary-department-for-each-employee/
-- Runtime  : 727 ms (beats 20%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

# Write your MySQL query statement below
SELECT employee_id,
       department_id
FROM Employee
WHERE primary_flag = 'Y'
   OR employee_id IN (
       SELECT employee_id
       FROM Employee
       GROUP BY employee_id
       HAVING COUNT(department_id) = 1
   );
