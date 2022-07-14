use sakila;

select first_name, last_name from customer
where (first_name) OR (last_name) like '%a%' OR '%w%';