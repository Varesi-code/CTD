-- Checkpoint II: informes
-- Realizar los siguientes reportes:
-- 1. Listar todos los usuarios cuyo nombre comience con la letra “a”.
select * from usuario where
nombre like "a%";

-- 2. Listar todos los usuarios que no hayan cargado el email.
select * from usuario where
 email is null;

-- 3. Mostrar todos los canales creados entre el 01/04/2021 y el 01/06/2021.
select * from canal
where fechaCreacion between "2021-04-01" and "2021-06-01";

-- 4. Listar los 10 usuarios más jóvenes.
SELECT TIMESTAMPDIFF(YEAR,fechaNacimiento,CURDATE()) AS edad
FROM usuario 
order by edad
limit 10 ;
     

-- 5. Mostrar todas las playlists que sean privadas.
select * from playlist
where privado in (1);

-- 6. Listar el top 5 de videos con más cantidad de likes.
select * from video 
order by cantidadLikes desc limit 5;

-- 7. Insertar un usuario con los siguientes datos:
-- a. Nombre: Juan Jose Batzal
-- b. email: jjbatzal@gmail.com
-- c. password: jj1597
-- d. fecha de nacimiento: 01/04/2000
-- e. codigopostal: 1429
-- f. país: Argentina
-- g. Avatar: carita feliz


set sql_safe_updates = 0;
set foreign_key_checks = 0;

insert into usuario 
    	values(20,'Juan Jose Batzal', 'jjbatzal@gmail.com', 'jj1597', '2000-04-01', '1429', 9, 'carita feliz');

set sql_safe_updates = 1;
set foreign_key_checks = 1;

-- 8. Generar un listado con todos los usuarios que hayan nacido en el año 2000.
select * from usuario 
where fechaNacimiento between '2000-01-01' and '2000-12-31';

-- 9. Listar todos los países ordenados alfabéticamente y su nombre en
-- mayúsculas.
select idPais,upper(nombre)from pais order by nombre asc;


-- 10.Listar todos los videos que posean más de 500.000 reproducciones.
select * from video where cantidadReproducciones > 500000;

-- 11. Generar un reporte de todos los videos publicados en el año 2020 que sean
-- privados y que posean más de 100 dislikes.

select * from video
where privado = 1 and 
fechaPublicacion between "2020-01-01" and "2020-12-30"
and cantidadDislikes >100;


-- 12.Por error hemos cargado mal los datos de Juan Jose Batzal. La fecha de
-- nacimiento no era 01/04/2000, sino 04/01/2000. Ahora debemos crear y
-- ejecutar la sentencia necesaria para realizar la modificación.
set foreign_key_checks = 0;
UPDATE usuarios
SET fechaDeNacimiento = "2000-01-04"
WHERE id = 20 
-- sin terminar

-- 13.Listar todos los usuarios cuyo password contenga menos de 5 caracteres
-- (pista: ver la función length()).


-- 14. Generar un reporte de los usuarios. En la consulta mostrar los siguientes
-- títulos:
-- ID  
-- Nombre 
-- E-mail 
-- Fecha de Nacimiento
-- Edad 
-- Codigo de Pais

-- 15.Listar el video de mayor tamaño.


-- 16.Generar un reporte de las últimas 10 reacciones, listando la fecha, el código
-- de reacción, el ID de usuario y el video.


-- 17.Listar todos los videos que tengan menos de 100.000 reproducciones y 100 o
-- más likes.


-- 18.Mostrar todos los videos que incluyan la palabra “FAN” dentro de su
-- descripción.


-- 19.Generar un listado de los usuarios cuyos passwords sean aquellos que no
-- satisfacen las políticas de seguridad de la empresa. Estos son los que se
-- corresponden con: 123, 1234, 12345, abc, clave, password.


-- 20.Eliminar el avatar cuyo nombre sea avDhTube.

