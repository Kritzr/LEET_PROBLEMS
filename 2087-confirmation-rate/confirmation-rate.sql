# Write your MySQL query statement below
Select user_id, 
ROUND(AVG(CASE WHEN action = 'confirmed' then 1 ELSE 0 END),2) as confirmation_rate
from confirmations
right join signups using (user_id)  
group by user_id
