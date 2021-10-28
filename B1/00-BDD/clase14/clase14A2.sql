#Consultas moviesdb

#Funciones de agregación, GROUP BY y HAVING
#1. ¿Cuántas películas hay?
select count(title) from movies;

#2. ¿Cuántas películas tienen entre 3 y 7 premios?
select count(id) from movies
where awards between 3 and 7;

#3. ¿Cuántas películas tienen entre 3 y 7 premios y un rating mayor a 7?
select count(id) from movies
where awards between 3 and 7
and rating > 7;
#4. Crear un listado a partir de la tabla de películas, mostrar un reporte de la
#cantidad de películas por id. de género.
select count(movies.id), genre_id from movies
group by genre_id;
#5. De la consulta anterior, listar sólo aquellos géneros que tengan como suma
#de premios un número mayor a 5.
select count(movies.id), genre_id, awards from movies
group by genre_id
having awards > 5;

