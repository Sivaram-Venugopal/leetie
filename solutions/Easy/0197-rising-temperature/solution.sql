-- ──────────────────────────────────────────────────
-- Problem  : 197. Rising Temperature
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/rising-temperature/
-- Runtime  : 512 ms (beats 58%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

# Write your MySQL query statement below
SELECT w1.Id
FROM Weather w1
JOIN Weather w2
  ON DATEDIFF(w1.RecordDate, w2.RecordDate) = 1
  AND w1.Temperature > w2.Temperature;
