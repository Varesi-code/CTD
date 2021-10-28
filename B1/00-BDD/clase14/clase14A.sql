-- Join

-- 1. Utilizando la base de datos de movies, queremos conocer, por un lado, los
-- títulos y el nombre del género de todas las series de la base de datos.
select series.title, genres.name from series 
join genres on genres.id = genre_id;
-- 2. Por otro, necesitamos listar los títulos de los episodios junto con el nombre y
-- apellido de los actores que trabajan en cada uno de ellos.
select title, first_name, last_name from episodes
inner join actor_episode on episodes.id = episode_id
inner join actors on actors.id = actor_id;
-- 3. Para nuestro próximo desafío, necesitamos obtener a todos los actores o
-- actrices (mostrar nombre y apellido) que han trabajado en cualquier película
-- de la saga de La Guerra de las galaxias. 
select first_name,last_name, title from movies
 inner join actor_movie on movies.id = movie_id
 inner join actors on actors.id = actor_id
where title like "La Guerra de las galaxias%";
-- 4. Crear un listado a partir de la tabla de películas, mostrar un reporte de la
-- cantidad de películas por nombre de género. xxx
select distinct name, count(movies.id) from movies 
inner join genres 
on genre_id=genres.id
group by genres.id;

select * from genres
join movies on genres.id = genre_id;