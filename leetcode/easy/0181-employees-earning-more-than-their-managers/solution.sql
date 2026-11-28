#using sub Query

-- select e.name as Employee
-- from Employee e
-- where e.salary > (select m.salary
-- from Employee m
-- where m.id = e.managerId);

# using Sql Joins 

select e1.name as Employee from employee e
join employee e1
on e.id = e1.managerid
where e.salary<e1.salary;

