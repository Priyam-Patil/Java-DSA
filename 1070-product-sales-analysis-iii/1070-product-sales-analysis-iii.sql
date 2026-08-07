
select s.product_id,s.year as first_year,s.quantity,s.price
from Sales as s JOIN
(select product_id, min(year) as 1st_year
from Sales
group by product_id) as t
on s.product_id=t.product_id AND
s.year=t.1st_year;

