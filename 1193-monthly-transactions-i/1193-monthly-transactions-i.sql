select LEFT(trans_date,7) as month,
country,
count(*) as trans_count,
sum(case when state="approved" then 1 else 0 end) as approved_count,
sum(amount) as trans_total_amount,
sum(case when state="approved" then amount else 0 end) as approved_total_amount
from Transactions 
group by month,country;
-- for Alias name--> in execution order group by comes first before select but
-- MySQL has a special feature where it rewrites the alias internally.


