-- Reportes - JOINS movies db

-- Consignas:
-- 1. Obtener los artistas que han actuado en una o más películas.
select concat(first_name, " ", last_name) as actor, movies.title from actors 
join actor_movie on actors.id = actor_movie.actor_id
join movies on movies.id = actor_movie.movie_id;
-- 2. Obtener las películas donde han participado más de un artista según nuestra
-- base de datos.

select movies.title, count(actor_movie.actor_id) as actores from movies
join actor_movie on actor_movie.movie_id = movies.id
group by movies.title
having count(actor_movie.actor_id) >= 2;

-- 3. Obtener aquellos artistas que han actuado en alguna película, incluso
-- aquellos que aún no lo han hecho, según nuestra base de datos.
select concat(first_name, " ", last_name) as actor, movies.title from actors
left join actor_movie on actors.id = actor_movie.actor_id
left join movies on movies.id = actor_movie.movie_id;
-- 4. Obtener las películas que no se le han asignado artistas en nuestra base de
-- datos.
select movies.title, actors.id from movies
left join actor_movie on actor_movie.movie_id = movies.id
left join actors on actor_movie.actor_id = actors.id
group by movies.title
having actors.id is null;

-- 5. Obtener aquellos artistas que no han actuado en alguna película, según
-- nuestra base de datos.
select concat(first_name, " ", last_name) as actor, movies.title from actors
left join actor_movie on actors.id = actor_movie.actor_id
left join movies on movies.id = actor_movie.movie_id
where movies.id is null;

-- 6. Obtener aquellos artistas que han actuado en dos o más películas según
-- nuestra base de datos.
select concat(first_name, " ", last_name) as Actor, count(movies.id) as peliculas from actors
join actor_movie on actors.id = actor_movie.actor_id
join movies on movies.id = actor_movie.movie_id
group by Actor
having count(movies.id) >=2;
-- 7. Obtener aquellas películas que tengan asignado uno o más artistas, incluso
-- carrera aquellas que aún no le han asignado un artista en nuestra base de datos.
select title, movies.id, actor_movie.actor_id from movies
left join actor_movie on movies.id = actor_movie.movie_id
group by title;