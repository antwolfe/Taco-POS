USE sakila;

SELECT first_name, last_name FROM customer
WHERE (first_name) OR (last_name) LIKE '%a%' OR '%w%';