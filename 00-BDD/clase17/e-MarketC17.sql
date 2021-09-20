-- Vistas - Parte I

-- Clientes

-- 1. Crear una vista con los siguientes datos de los clientes: ID, contacto, y el
-- Fax. En caso de que no tenga Fax, colocar el teléfono, pero aclarándolo. Por
-- ejemplo: “TEL: (01) 123-4567”.
create view vista1 as 
select ClienteID, Contacto, coalesce(fax, concat("tel", Telefono)) as fax
from Clientes;

select * from vista1;

create view v_clientes as 
select clienteID as ID, contacto, 
case
when length(fax) = 0 then concat( "TEL:", Telefono)
else fax
end as Fax
from clientes;

select * from v_clientes;

select * from clientes;
 
-- 2. Se necesita listar los números de teléfono de los clientes que no tengan
-- fax. Hacerlo de dos formas distintas:
-- a. Consultando la tabla de clientes.
-- b. Consultando la vista de clientes.

-- Proveedores

-- 1. Crear una vista con los siguientes datos de los proveedores: ID,
-- contacto, compañía y dirección. Para la dirección tomar la dirección,
-- ciudad, código postal y país.

-- 2. Listar los proveedores que vivan en la calle Americanas en Brasil. Hacerlo
-- de dos formas distintas:
-- a. Consultando la tabla de proveedores.
-- b. Consultando la vista de proveedores.


-- Vistas - Parte II

-- 1. Crear una vista de productos que se usará para control de stock. Incluir el ID
-- y nombre del producto, el precio unitario redondeado sin decimales, las
-- unidades en stock y las unidades pedidas. Incluir además una nueva
-- columna PRIORIDAD con los siguientes valores:
-- ■ BAJA: si las unidades pedidas son cero.
-- ■ MEDIA: si las unidades pedidas son menores que las unidades
-- en stock.
-- ■ URGENTE: si las unidades pedidas no duplican el número de
-- unidades.
-- ■ SUPER URGENTE: si las unidades pedidas duplican el número
-- de unidades en caso contrario.

-- 2. Se necesita un reporte de productos para identificar problemas de stock.
-- Para cada prioridad indicar cuántos productos hay y su precio promedio.
-- No incluir las prioridades para las que haya menos de 5 productos.