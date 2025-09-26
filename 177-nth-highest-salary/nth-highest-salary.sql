CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N= N-1;
  RETURN (
      # Write your MySQL query statement below.
        SELECT DISTINCT Salary from employee order by salary desc limit n, 1

  );
END