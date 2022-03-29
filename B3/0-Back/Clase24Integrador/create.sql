DROP TABLE IF EXISTS odontologos;
CREATE TABLE odontologos (
matricula INT NOT NULL,
nombre VARCHAR(50) NOT NULL,
apellido VARCHAR(50) NOT NULL);


DROP TABLE IF EXISTS domicilios;
CREATE TABLE domicilios (ID INT AUTO_INCREMENT PRIMARY KEY,
CALLE varchar(200) NOT NULL,
NUMERO INT NOT NULL,
LOCALIDAD varchar(100) NOT NULL,
PROVINCIA varchar(100) NOT NULL);

DROP TABLE IF EXISTS pacientes;
CREATE TABLE pacientes (ID INT AUTO_INCREMENT PRIMARY KEY,
APELLIDO varchar(100) NOT NULL,
NOMBRE varchar(100) NOT NULL,
EMAIL varchar(100) NOT NULL,
DNI INT NOT NULL,
FECHA_INGRESO DATE NOT NULL,
DOMICILIO_ID INT NOT NULL);

INSERT INTO domicilios (calle, numero, localidad, provincia) VALUES ('Calle A',474,'Cafayate','Salta');
INSERT INTO domicilios (calle, numero, localidad, provincia) VALUES ('Calle B',7841,'Óran','Salta');

INSERT INTO pacientes (apellido, nombre, email, dni, fecha_ingreso, domicilio_id)
VALUES ('Baspineiro','Rodolfo','qwe@gmail.com',147852,'2022-03-01',1);

INSERT INTO pacientes (apellido, nombre, email, dni, fecha_ingreso, domicilio_id)
VALUES ('Baspineiro','Ezequiel','zxc@gmail.com',748574,'2022-03-10',2);

--INSERT INTO odontologos VALUES (1456, 'Gabriela', 'Perez');
--INSERT INTO odontologos VALUES (22134, 'Pedro', 'Martinez');
--INSERT INTO odontologos VALUES (3789, 'Maria', 'Lopez');
--INSERT INTO odontologos VALUES (5789, 'Juan', 'Torres');
