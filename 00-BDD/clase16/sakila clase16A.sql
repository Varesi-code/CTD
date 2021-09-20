-- Reportes SAKILA
-- Reportes parte 1:

-- 1. Obtener el nombre y apellido de los primeros 5 actores disponibles. Utilizar
-- alias para mostrar los nombres de las columnas en español.
select first_name as Nombre, last_name as apellido from actor
limit 5;

-- 2. Obtener un listado que incluya nombre, apellido y correo electrónico de los
-- clientes (customers) inactivos. Utilizar alias para mostrar los nombres de las
-- columnas en español.
select customer.last_name as nombre, customer.last_name as apellido, customer.email as Email
from customer
where customer.active is false;
--  3. Obtener un listado de films incluyendo título, año y descripción de los films
-- que tienen un rental_duration mayor a cinco. Ordenar por rental_duration de
-- mayor a menor. Utilizar alias para mostrar los nombres de las columnas en
-- español.
select * from film;

select film.title as titulo, film.release_year as año_estreno, film.description as descripcion 
from film
where rental_duration > 5
order by año_estreno desc;

-- 4. Obtener un listado de alquileres (rentals) que se hicieron durante el mes de
-- mayo de 2005, incluir en el resultado todas las columnas disponibles.
select * from rental
where rental_date between "2005-05-01" and "2005-05-31";

-- Reportes parte 2: Sumemos complejidad

-- Si llegamos hasta acá, tenemos en claro la estructura básica de un
-- SELECT. En los siguientes reportes vamos a sumar complejidad.
-- ¿Probamos?
-- 1. Obtener la cantidad TOTAL de alquileres (rentals). Utilizar un alias para
-- mostrarlo en una columna llamada “cantidad”.
select count(rental.rental_id) as cantidad from rental;
-- 2. Obtener la suma TOTAL de todos los pagos (payments). Utilizar un alias para
-- mostrarlo en una columna llamada “total”, junto a una columna con la
-- cantidad de alquileres con el alias “Cantidad” y una columna que indique el
-- “Importe promedio” por alquiler.
select * from payment;

select sum(amount) as total, count(rental_id) as cantidad, avg(payment.amount) as "importe promedio"
 from payment;
-- 3. Generar un reporte que responda la pregunta: ¿cuáles son los diez clientes
-- que más dinero gastan y en cuántos alquileres lo hacen?
select * from customer;
select* from payment;

select concat(customer.first_name, " ", customer.last_name) as cliente, 
sum(payment.amount) as dinero_gastado, count(rental.rental_id) cantidad_alquileres
from customer 
join payment on customer.customer_id = payment.customer_id
join rental on payment.customer_id = rental.customer_id
group by customer.customer_id
order by dinero_gastado desc
limit 10;
-- 4. Generar un reporte que indique: ID de cliente, cantidad de alquileres y monto
-- total para todos los clientes que hayan gastado más de 150 dólares en
-- alquileres.

SELECT customer.customer_id as idCliente, COUNT(rental.customer_id) as CantAlq, SUM(amount)as monto_total
FROM customer
INNER JOIN payment ON customer.customer_id = payment.customer_id
INNER JOIN rental ON payment.rental_id = rental.rental_id

GROUP BY idcliente
having SUM(amount) > 150
order by monto_total desc;

-- 5. Generar un reporte que muestre por mes de alquiler (rental_date de tabla
-- rental), la cantidad de alquileres y la suma total pagada (amount de tabla
-- payment) para el año de alquiler 2005 (rental_date de tabla rental).
select count(rental.rental_id), sum(amount), month(rental_date)from rental
join payment on rental.rental_id = payment.rental_id
where extract(year from rental_date) ="2005"
group by extract(month from rental_date);

select count(rental.rental_id), month(rental_date) , sum(amount) , rental_date
from rental
inner join payment
on payment.rental_id = rental.rental_id
where year(rental_date) = 2005
group by month(rental_date);

-- 6. Generar un reporte que responda a la pregunta: ¿cuáles son los 5
-- inventarios más alquilados? (columna inventory_id en la tabla rental). Para
-- cada una de ellas indicar la cantidad de alquileres.
select count(rental.inventory_id) as cantidad_alquileres, rental.inventory_id as inventario from inventory
join rental on rental.inventory_id = inventory.inventory_id  
group by inventory.inventory_id 
order by cantidad_alquileres desc
limit 5; 