
-- Reportes parte II - INNER, LEFT Y RIGHT JOIN

-- 1. Listar todas las categorías junto con información de sus productos. Incluir todas
-- las categorías aunque no tengan productos.
select * from productos
right join categorias on categorias.CategoriaID = productos.CategoriaID;

-- 2. Listar la información de contacto de los clientes que no hayan comprado nunca
-- en emarket.
select * from clientes 
left join facturas on clientes.ClienteID = facturas.ClienteID
where isnull(facturas.facturaId);

-- 3. Realizar un listado de productos. Para cada uno indicar su nombre, categoría, y
-- la información de contacto de su proveedor. Tener en cuenta que puede haber
-- productos para los cuales no se indicó quién es el proveedor.
select productos.ProductoNombre, categorias.CategoriaNombre, proveedores.Compania, concat(telefono, " ", Fax) as contacto
from productos
right join proveedores on proveedores.ProveedorID = productos.ProveedorID
right join categorias on categorias.CategoriaID = productos.CategoriaID
where productos.ProductoID is not null;

-- 4. Para cada categoría listar el promedio del precio unitario de sus productos.

-- 5. Para cada cliente, indicar la última factura de compra. Incluir a los clientes que
-- nunca hayan comprado en e-market.

-- 6. Todas las facturas tienen una empresa de correo asociada (enviovia). Generar un
-- listado con todas las empresas de correo, y la cantidad de facturas
-- correspondientes. Realizar la consulta utilizando RIGHT JOIN.
select facturas.facturaid, correos.compania, contacto, productos.CategoriaID, categorianombre, productonombre, 
productos.PrecioUnitario, facturadetalle.PrecioUnitario, Cantidad
from correos
join facturas
on correos.CorreoID = facturas.EnvioVia
join clientes
on facturas.ClienteID = clientes.ClienteID
join facturadetalle
on facturas.FacturaID = facturadetalle.FacturaID
join productos
on facturadetalle.ProductoID = productos.ProductoID
join categorias
on productos.CategoriaID = categorias.CategoriaID;
