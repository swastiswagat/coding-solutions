# Write your MySQL query statement beloselect 
select Max(salary) as SecondHighestSalary
from Employee
where salary < (select MAX(salary)
from Employee);