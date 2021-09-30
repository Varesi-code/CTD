-- Adventureworks
-- Where
-- 1. Mostrar el nombre, precio y color de los accesorios para asientos de las bicicletas
-- cuyo precio sea mayor a 100 pesos
-- Tablas: Production.Product
-- Campos: Name, ListPrice, Color
select * from product;

-- Operadores & joins
-- 1. Mostrar los empleados que tienen más de 90 horas de vacaciones
-- Tablas: Employee
-- Campos: VacationHours, BusinessEntityID
-- 2. Mostrar el nombre, precio y precio con iva de los productos con precio distinto de
-- cero
-- Tablas: Product
-- Campos: Name, ListPrice
-- 3. Mostrar precio y nombre de los productos 776, 777, 778
-- Tablas: Product
-- Campos: ProductID, Name, ListPrice
-- Order by

-- 1. Mostrar las personas ordenadas primero por su apellido y luego por su nombre
-- Tablas: Contact
-- Campos: Firstname, Lastname
-- Funciones de agregación
-- 1. Mostrar la cantidad y el total vendido por productos
-- Tablas: SalesOrderDetail
-- Campos: LineTotal
-- Group by
-- 1. Mostrar el código de subcategoría y el precio del producto más barato de cada una
-- de ellas
-- Tablas: Product
-- Campos: ProductSubcategoryID, ListPrice
-- Having
-- 1. Mostrar todas las facturas realizadas y el total facturado de cada una de ellas
-- ordenado por número de factura pero sólo de aquellas órdenes superen un total de
-- $10.000
-- Tablas: SalesOrderDetail
-- Campos: SalesOrderID, LineTotal
-- Joins

-- 1. Mostrar los empleados que también son vendedores
-- Tablas: Employee, SalesPerson
-- Campos: BusinessEntityID
-- 2. Mostrar los empleados ordenados alfabéticamente por apellido y por nombre
-- Tablas: Employee, Contact
-- Campos: BusinessEntityID, LastName, FirstName