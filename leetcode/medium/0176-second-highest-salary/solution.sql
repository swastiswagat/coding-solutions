/* Write your PL/SQL query statement below */
SELECT MAX(Salary) as SecondHighestSalary
FROM (SELECT Salary, DENSE_RANK() OVER (ORDER BY salary DESC) as RNK
FROM Employee
)
WHERE RNK = 2;