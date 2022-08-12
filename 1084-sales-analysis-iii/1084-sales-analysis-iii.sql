# Write your MySQL query statement below
Select Product.product_id,Product.product_name from Product
INNER JOIN Sales ON Product.product_id=Sales.product_id 
group by Product.product_id
having max(Sales.sale_date) between '2019-01-01' and '2019-03-31'
and min(Sales.sale_date) between '2019-01-01' and '2019-03-31'