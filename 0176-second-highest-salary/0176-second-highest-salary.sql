# Write your MySQL query statement below
select Max(salary) as SecondHighestSalary
from employee
where salary<(select Max(salary) from employee);