USE sakila;

SELECT film_id, store_id, COUNT(film_id) AS inventory_count FROM inventory
GROUP BY film_id, store_id
ORDER BY film_id













