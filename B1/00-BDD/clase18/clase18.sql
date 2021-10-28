-- e-Market
-- Ejercicio 1

-- 1. Crear una vista para poder organizar los envíos de las facturas. Indicar número
-- de factura, fecha de la factura y fecha de envío, ambas en formato dd/mm/yyyy,
-- valor del transporte formateado con dos decimales, y la información del
-- domicilio del destino incluyendo dirección, ciudad, código postal y país, en una
-- columna llamada Destino.
select * from facturas;

alter view vista1 as 
select FacturaID as "numero de factura", date_format(fechafactura, "%D/%M/%Y") as "fecha de la factura",
 date_format(fechaenvio, "%D/%M/%Y") as "fecha de envio", format(Transporte, 2.2) as "valor del transporte",
 concat(direccionenvio, ", ", ciudadenvio, ", ", codigopostalenvio, ", ", paisenvio )  as Destino 
 from facturas;

select * from vista1;
-- 2. Realizar una consulta con todos los correos y el detalle de las facturas que
-- usaron ese correo. Utilizar la vista creada.
select * from correos;
select * from facturas;

create view vista2 as
select * from correos
join facturas on facturas.enviovia = correos.CorreoID
group by CorreoID, FacturaID; 

select * from vista2;

-- 3. ¿Qué dificultad o problema encontrás en esta consigna? Proponer alguna
-- alternativa o solución.

-- Ejercicio 2

-- 1. Crear una vista con un detalle de los productos en stock. Indicar id, nombre del
-- producto, nombre de la categoría y precio unitario.
select * from productos;

create view view3 as
select ProductoID, ProductoNombre, categorias.CategoriaNombre as categoria, PrecioUnitario from productos
join categorias on productos.CategoriaID = categorias.CategoriaID
where UnidadesStock > 0
order by ProductoID;

select * from view3;

-- 2. Escribir una consulta que liste el nombre y la categoría de todos los productos
-- vendidos. Utilizar la vista creada.

-- 3. ¿Qué dificultad o problema encontrás en esta consigna? Proponer alguna
-- alternativa o solución.
