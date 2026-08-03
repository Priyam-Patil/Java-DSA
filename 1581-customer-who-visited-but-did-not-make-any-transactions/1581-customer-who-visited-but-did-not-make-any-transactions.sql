# Write your MySQL query statement below

SELECT v.customer_id,COUNT(v.visit_id) as count_no_trans
 FROM Visits v LEFT JOIN Transactions t
ON t.visit_id=v.visit_id
where t.transaction_id is null
GROUP BY v.customer_id;

