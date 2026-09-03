-- ──────────────────────────────────────────────────
-- Problem  : 182. Duplicate Emails
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/duplicate-emails/
-- Runtime  : 420 ms (beats 48%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

# Write your MySQL query statement below
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(*) > 1;
