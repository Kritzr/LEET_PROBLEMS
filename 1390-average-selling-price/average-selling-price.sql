# Write your MySQL query statement below
select p.product_id, ifnull(round(sum(units*price)/sum(units),2),0) as average_price from 
Prices p left join UnitsSold u on u.product_id=p.product_id and purchase_date between start_date and end_date group by p.product_id;