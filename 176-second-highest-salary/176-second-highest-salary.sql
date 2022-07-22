# Write your MySQL query statement below
SELECT IFNULL((select distinct salary  from Employee 
ORDER BY salary DESC
limit 1 offset 1),NULL) AS SecondHighestSalary