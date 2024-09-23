1. Find the Nth Highest Salary
Find the second highest salary : SELECT DISTINCT salary
FROM employees
ORDER BY salary DESC
LIMIT 1 OFFSET 1;

Alternatively, using a subquery:SELECT MAX(salary)
FROM employees
WHERE salary < (SELECT MAX(salary) FROM employees);

2. Find Employees with Salaries Above the AverageSELECT name, salary
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);

3. Identify Duplicate Records
Find duplicate names in an employee table:SELECT name, COUNT(*)
FROM employees
GROUP BY name
HAVING COUNT(*) > 1;

4. Delete Duplicate Records
Delete duplicates while keeping one record:DELETE FROM employees
WHERE id NOT IN (
 SELECT MIN(id)
 FROM employees
 GROUP BY name
);

5. Update Records Based on a Condition
Increase the salary of all employees in the 'Sales' department by 10%:
UPDATE employees
SET salary = salary * 1.10
WHERE department = 'Sales';

6. Use of CASE Statement Categorize employees based on salary:
SELECT name, salary,
 CASE
 WHEN salary < 30000 THEN 'Low'
 WHEN salary BETWEEN 30000 AND 70000 THEN 'Medium'
 ELSE 'High'
 END AS SalaryCategory
FROM employees;