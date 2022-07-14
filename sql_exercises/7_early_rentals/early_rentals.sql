use sakila;
select rental_id, date(rental_date), inventory_id, customer_id, date(return_date), staff_id, date(last_update) from rental
where rental_date < '10:00:00'
ORDER BY rental_date DESC
limit 10;
