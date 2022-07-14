USE sakila;

SELECT title, length FROM film
WHERE length > 120 AND title LIKE '%z%' OR '%t%' OR '%s%'
ORDER BY length ASC; 