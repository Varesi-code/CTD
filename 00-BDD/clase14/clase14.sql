-- Consultando la BD e-Market

-- Clientes
-- 1) ¿Cuántos clientes existen?
select count(clienteid) from clientes;
-- 2) ¿Cuántos clientes hay por ciudad?
select count(clienteid), ciudad from clientes 
group by ciudad;
 -- Facturas
-- 1) ¿Cuál es el total de transporte?
select sum(transporte) from facturas;
-- 2) ¿Cuál es el total de transporte por EnvioVia (empresa de envío)?
select sum(enviovia) from facturas;
-- 3) Calcular la cantidad de facturas por cliente. Ordenar descendentemente por
-- cantidad de facturas.
select count(facturaid), ClienteID from facturas
group by ClienteID
order by count(FacturaID) DESC;
-- 4) Obtener el Top 5 de clientes de acuerdo a su cantidad de facturas.
select clienteid, facturaid from facturas
group by ClienteID
order by max(FacturaID) desc limit 5;
-- 5) ¿Cuál es el país de envío menos frecuente de acuerdo a la cantidad de facturas?
select paisenvio, count(facturaid) from facturas
group by ClienteID
order by count(FacturaID) limit 1;
-- 6) Se quiere otorgar un bono al empleado con más ventas. ¿Qué ID de empleado
-- realizó más operaciones de ventas?
select EmpleadoID, count(facturaid) from facturas
group by ClienteID
order by count(FacturaID) desc limit 1;

-- Factura detalle
-- 1) ¿Cuál es el producto que aparece en más líneas de la tabla Factura Detalle?
select count(ProductoID) as total, productoId from facturadetalle
group by productoid
order by total desc limit 1;

-- 2) ¿Cuál es el total facturado? Considerar que el total facturado es la suma de
-- cantidad por precio unitario.
select sum(preciounitario) from facturadetalle;
-- 3) ¿Cuál es el total facturado para los productos ID entre 30 y 50?
select sum(preciounitario*cantidad) from facturadetalle
where ProductoID between 30 and 50;
-- 4) ¿Cuál es el precio unitario promedio de cada producto?
select avg(preciounitario), ProductoID from facturadetalle
group by ProductoID;
-- 5) ¿Cuál es el precio unitario máximo?
select max(preciounitario) from facturadetalle;
--  Consultas queries XL parte II - JOIN
-- En esta segunda parte vamos a intensificar la práctica de consultas con JOIN.
-- 1) Generar un listado de todas las facturas del empleado 'Buchanan'.
select facturaId, nombre, apellido
from facturas 
join empleados
on facturas.EmpleadoID = empleados. empleadoid
where empleados.apellido like ("buchanan%");
-- 2) Generar un listado con todos los campos de las facturas del correo 'Speedy
-- Express'.
select compania, facturas.*
from facturas
join correos
on CorreoID = enviovia
where compania = "Speedy Express";
-- 3) Generar un listado de todas las facturas con el nombre y apellido de los
-- empleados.
select  concat(nombre, " ", apellido) as NombreCompleto, facturaid from facturas
join empleados
on empleados.EmpleadoID = facturas.empleadoid;

-- 4) Mostrar un listado de las facturas de todos los clientes “Owner” y país de envío
-- “USA”.
select * FROM facturas
join clientes
on facturas.ClienteID = clientes.ClienteID
where clientes.titulo ="Owner" and PaisEnvio = "USA";

-- 5) Mostrar todos los campos de las facturas del empleado cuyo apellido sea
-- “Leverling” o que incluyan el producto id = “42”.
select * , empleados.apellido from facturas
join empleados
on empleados.EmpleadoID = facturas.EmpleadoID
join facturadetalle
on facturas.FacturaID = facturadetalle.FacturaID
where empleados.Apellido = "Leverling" or facturadetalle.ProductoID = 42;

-- 6) Mostrar todos los campos de las facturas del empleado cuyo apellido sea
-- “Leverling” y que incluya los producto id = “80” o ”42”.


-- 7) Generar un listado con los cinco mejores clientes, según sus importes de
-- compras total (PrecioUnitario * Cantidad).

-- 8) Generar un listado de facturas, con los campos id, nombre y apellido del cliente,
-- fecha de factura, país de envío, Total, ordenado de manera descendente por
-- fecha de factura y limitado a 10 filas. 
