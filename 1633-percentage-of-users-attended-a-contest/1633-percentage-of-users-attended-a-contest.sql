
select r.contest_id, round( count(*) *100  /(select count(*) from Users),2) as percentage
from Users as u inner join  Register as r
on u.user_id = r.user_id
group by r.contest_id
order by percentage DESC , r.contest_id  ;


