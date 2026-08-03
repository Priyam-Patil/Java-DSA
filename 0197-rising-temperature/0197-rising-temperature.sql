# Write your MySQL query statement below

select id from Weather as today
where exists(
    select 1 from Weather as yesterday
    where today.temperature>yesterday.temperature
    AND DATEDIFF(today.recordDate,yesterday.recordDate)=1
);
