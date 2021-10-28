
# Realizar los siguientes informes:

# 1.Listar las canciones que poseen la letra “z” en su título.
select * from cancion 
where titulo like "%z%";

# 2.Listar las canciones que poseen como segundo carácter la letra “a” y como último, la letra “s”.
select * from cancion 
where titulo like "_a%_s";

# 3.Mostrar la playlist que tiene más canciones, renombrando las columnas poniendo mayúsculas en la primera letra, los tildes correspondientes y agregar los espacios entre palabras.
select idPlaylist as Playlist, 
idusuario as Usuario, 
titulo as Título, 
cantcanciones as CantidadCanciones,
idestado as Estado, 
Fechacreacion as FechaDeCreación, 
Fechaeliminada as FechaEliminada from playlist
ORDER BY cantcanciones DESC
LIMIT 1;

# 4.En otro momento se obtuvo un listado con los 5 usuarios más jóvenes, obtener un listado de los 10 siguientes.
select * from usuario
order by fecha_nac 
LIMIT 10 OFFSET 5;

# 5.Listar las 5 canciones con más reproducciones, ordenadas descendentemente.
select * from cancion 
order by cantreproduccion DESC
limit 5;

# 6.Generar un reporte de todos los álbumes ordenados alfabéticamente.
select * from album
order by titulo;

# 7.Listar todos los álbumes que no tengan imagen, ordenados alfabéticamente.
select * from album
where imagenportada IS null
order by titulo;

# 8.Insertar un usuario nuevo con los siguientes datos (tener en cuenta las relaciones):
# 	a) nombreusuario: nuevousuariodespotify@gmail.com
#	 b) Nombre y apellido: Elmer Gomez
# 	 c) password: S4321m
# 	 d) Fecha de nacimiento: 
# 	 e) Sexo: Masculino
# 	 f) Código Postal: B4129ATF
# 	 g) País: Colombia

INSERT INTO `spotify2`.`usuario`
(`idUsuario`,
`nombreusuario`,
`nyap`,
`fecha_nac`,
`sexo`,
`CP`,
`password`,
`Pais_idPais`,
`IdTipoUsuario`)
VALUES
(20,
"nuevousuariodespotify@gmail.com",
"Elmer Gomez",
15/11/1991,
"M",
"B4129ATF",
"S4321m",
2,
3);

# 9.Eliminar todas las canciones de género “pop” (9).
set sql_safe_updates = 0;

select * from generoxcancion
where IdGenero = 9

order by IdCancion;
SET FOREIGN_KEY_CHECKS=0;

   DELETE FROM cancion 
     WHERE idcancion IN
       (select idcancion from generoxcancion
		where IdGenero = 9);

SET FOREIGN_KEY_CHECKS=1;

DELETE FROM `spotify2`.`generoxcancion`
WHERE IdGenero = 9;

select * from cancion;

# 10.Editar todos los artistas que no tengan una imagen cargada y cargarles el texto “Imagen faltante” en la columna de imagen.
select * from artista
where imagen is null;

UPDATE `spotify2`.`artista`
SET
`imagen` = "Imagen faltante"
WHERE imagen is null;

select * from artista
where imagen = "Imagen faltante";

set sql_safe_updates = 1

