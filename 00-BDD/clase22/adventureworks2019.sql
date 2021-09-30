-- Repaso General - AdventureWorks 2019
-- Consignas
-- A continuación encontrarás una serie de ejercicios para practicar:

-- Where
-- 1. Mostrar las personas que la segunda letra de su apellido es una s
-- Tablas: Contact
-- Campos: LastName

-- 2. Mostrar el nombre concatenado con el apellido de las personas cuyo apellido
-- tengan terminación española (ez)
-- Tablas: Contact
-- Campos: FirstName, LastName

-- 3. Mostrar los nombres de los productos que terminen en un número
-- Tablas: Product
-- Campos: Name

-- 4. Mostrar las personas cuyo nombre tenga una C o c como primer carácter, cualquier
-- otro como segundo carácter, ni d, e, f, g como tercer carácter, cualquiera entre j y r
-- o entre s y w como cuarto carácter y el resto sin restricciones
-- Tablas: Contact
-- Campos: FirstName

-- Between
-- 1. Mostrar todos los productos cuyo precio de lista esté entre 200 y 300
-- Tablas: Product
-- Campos: ListPrice

-- 2. Mostrar todos los empleados que nacieron entre 1970 y 1985
-- Tablas: Employee
-- Campos: BirthDate

-- Operadores & joins
-- 1. Mostrar el código, fecha de ingreso y horas de vacaciones de los empleados
-- ingresaron a partir del año 2000
-- Tablas: Employee
-- Campos: BusinessEntityID, HireDate, VacationHours

-- 2. Mostrar el nombre, número de producto, precio de lista y el precio de lista
-- incrementado en un 10% de los productos cuya fecha de fin de venta sea anterior al
-- día de hoy
-- Tablas: Product
-- Campos: Name, ProductNumber, ListPrice, SellEndDate
-- Consultas con "Null"

-- 1. Mostrar los representantes de ventas (vendedores) que no tienen definido el
-- número de territorio
-- Tablas: SalesPerson
-- Campos: TerritoryID, BusinessEntityID

-- 2. Mostrar el peso de todos los artículos. si el peso no estuviese definido, reemplazar
-- por cero
-- Tablas: Product
-- Campos: Weight

-- Funciones de agregación
-- 1. Mostrar la fecha de nacimiento del empleado más joven
-- Tablas: Employee
-- Campos: BirthDate

-- 2. Mostrar el promedio del listado de precios de productos
-- Tablas: Product
-- Campos: ListPrice

-- Group by
-- 1. Mostrar los productos y el total vendido de cada uno de ellos, ordenados por el total
-- vendido
-- Tablas: SalesOrderDetail
-- Campos: ProductID, LineTotal

-- 2. Mostrar el promedio vendido por factura.
-- Tablas: SalesOrderDetail
-- Campos: SalesOrderID, LineTotal

-- Having
-- 1. Mostrar las subcategorías de los productos que tienen dos o más productos que
-- cuestan menos de $150
-- Tablas: Product
-- Campos: ProductSubcategoryID, ListPrice

-- 2. Mostrar todos los códigos de subcategorías existentes junto con la cantidad para los
-- productos cuyo precio de lista sea mayor a $ 70 y el precio promedio sea mayor a $
-- 300.
-- Tablas: Product
-- Campos: ProductSubcategoryID, ListPrice

-- Joins
-- 1. Mostrar los precios de venta de aquellos productos donde el precio de venta sea
-- inferior al precio de lista recomendado para ese producto ordenados por nombre
-- de producto
-- Tablas: SalesOrderDetail, Product
-- Campos: ProductID, Name, ListPrice, UnitPrice

-- 2. Mostrar todos los productos que tengan igual precio. Se deben mostrar de a pares,
-- código y nombre de cada uno de los dos productos y el precio de ambos.ordenar
-- por precio en forma descendente
-- Tablas: Product
-- Campos: ProductID, ListPrice, Name

-- 3. Mostrar el nombre de los productos y de los proveedores cuya subcategoría es 15
-- ordenados por nombre de proveedor
-- Tablas: Product, ProductVendor, Vendor
-- Campos: Name ,ProductID, BusinessEntityID, ProductSubcategoryID

-- 4. Mostrar todas las personas (nombre y apellido) y en el caso que sean empleados
-- mostrar también el login id, sino mostrar null
-- Tablas: Contact, Employee
-- Campos: FirstName, LastName, LoginID, BusinessEntityID