-- 1. a) Crear una vista denominada “vista_mostrar_pais” que devuelva un reporte de los países.
create view vista_mostrar_pais as
select * from country;

select * from vista_mostrar_pais;

/* 2. a) Crear una vista que devuelva un resumen con el apellido y nombre (en una
sola columna denominada “artista”) de los artistas y la cantidad de
filmaciones que tienen. Traer solo aquellos que tengan más de 25
filmaciones y ordenarlos por apellido.*/

create view artista_mas_25_films as
select concat(first_name, " ", last_name) artista, count(film.film_id) as cantidad_films from actor
inner join film_actor
on actor.actor_id = film_actor.actor_id
inner join film
on film.film_id = film_actor.film_id
group by actor.actor_id
having cantidad_films > 25
order by artista;
-- da el mismo resultado
select concat(first_name, " ", last_name) artista, count(film_actor.film_id) as cantidad_films from actor
inner join film_actor
on actor.actor_id = film_actor.actor_id
group by actor.actor_id
having cantidad_films > 25
order by artista;

-- c) En la misma invocación de la vista, traer aquellos artistas que tienen menos de 33 filmaciones.
select lower(artista) from artista_mas_25_films
where cantidad_films > 33 and artista like "a%";

drop view artista_mas_25_films;

/*  3 a) Crear una vista que devuelva un reporte del título de la película, el apellido
y nombre (en una sola columna denominada “artista”) de los artistas y el
costo de reemplazo. Traer solo aquellas películas donde su costo de
reemplazo es entre 15 y 27 dólares, ordenarlos por costo de reemplazo. */

create view peliculas_reemplazo as
select film.title as pelicula, concat(actor.first_name, " ", actor.last_name) as artista, film.replacement_cost as "costo de reemplazo" from actor
inner join film_actor
on actor.actor_id = film_actor.actor_id
inner join film
on film.film_id = film_actor.film_id
where film.replacement_cost between 15 and 27
order by film.replacement_cost;

select * from peliculas_reemplazo;

select * from peliculas_reemplazo
where pelicula like "b%";

alter view peliculas_reemplazo as
select film.title as pelicula, concat(actor.first_name, " ", actor.last_name) as artista, film.replacement_cost as "costo de reemplazo" from actor
inner join film_actor
on actor.actor_id = film_actor.actor_id
inner join film
on film.film_id = film_actor.film_id
where film.replacement_cost between 15 and 27 and actor.first_name like "%a"
order by film.replacement_cost desc;

select * from peliculas_reemplazo;