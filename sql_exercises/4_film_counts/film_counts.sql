USE sakila;

select * from inventory;

SELECT film_id, store_id, count(film_id) as inventory_count from inventory
group by film_id, store_id
ORDER BY film_id













