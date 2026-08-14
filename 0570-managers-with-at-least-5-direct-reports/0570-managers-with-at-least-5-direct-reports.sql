# Write your MySQL query statement below

select e1.name from Employee e1 join Employee e2 on e1.id = e2.ManagerId group by e2.ManagerId having count(e2.ManagerId) >= 5;