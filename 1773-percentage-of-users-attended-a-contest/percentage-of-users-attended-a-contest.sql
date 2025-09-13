# Write your MySQL query statement below
SELECT 
    r.contest_id, 
    ROUND(COUNT(DISTINCT r.user_id) * 100.0 / (SELECT COUNT(DISTINCT u.user_id) FROM users u), 2) AS percentage
FROM register r
GROUP BY r.contest_id
ORDER BY percentage DESC, r.contest_id ASC;
