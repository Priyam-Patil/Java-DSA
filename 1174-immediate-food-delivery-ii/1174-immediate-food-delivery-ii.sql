
select round (avg(case when min_o_date=min_pref_date then 1 else 0 end)*100,2) as immediate_percentage
from
(select customer_id ,min(order_date) as min_o_date, min(customer_pref_delivery_date ) as min_pref_date
from Delivery
group by customer_id ) as derived_table;

