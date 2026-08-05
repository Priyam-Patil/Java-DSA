

select s.user_id,

-- ROUND(SUM(CASE WHEN c.action="confirmed" THEN 1 ELSE 0 END)/COUNT(*),2) as confirmation_rate
ROUND(AVG(CASE WHEN c.action="confirmed" then 1 else 0 end),2) as confirmation_rate
-- ROUND(IFNULL(avg(case when c.action="confirmed" then 1 else 0 end),0),2) as confirmation_rate


from Signups as s left join Confirmations as c
on s.user_id=c.user_id 
group by s.user_id;


