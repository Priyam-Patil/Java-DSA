
select manager.employee_id,manager.name,count(*) as  reports_count,round(avg(emp.age)) as average_age 
from  employees as emp
INNER JOIN employees as manager
on emp.reports_to=manager.employee_id
group by manager.employee_id
order by manager.employee_id;