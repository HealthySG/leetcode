# Write your MySQL query statement below
Select sell_date,count(distinct product) AS num_sold,
Group_Concat(distinct product Order By product) as products
from Activities 
Group by sell_date 