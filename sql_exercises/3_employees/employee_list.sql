Use sakila;
SELECT CONCAT(last_name, ', ', first_name) AS employee_fullname
FROM staff
WHERE staff_id < 20;