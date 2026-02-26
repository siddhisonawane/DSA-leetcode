# Write your MySQL query statement below

select el.name Employee
from Employee el,Employee e2
where el.managerId=e2.id
And
el.salary>e2.salary;