-- Create DATABASE famili
CREATE DATABASE familia;
-- USE DATABASE familia;
USE familia;
-- persona
DROP TABLE IF EXISTS persona;
CREATE TABLE persona(
persona_id int auto_increment,
nombre varchar(60) NOT NULL,
edad int NOT NULL,
correo varchar(255) NOT NULL unique,
estado varchar(255) DEFAULT NULL, 
cumpleanios date NOT NULL,
primary key(persona_id)
);

-- mascotas
DROP TABLE IF EXISTS mascota;
CREATE TABLE mascota(
mascota_id int auto_increment,
persona_id int NOT NULL,
nombre varchar (255) NOT NULL,
edad int NOT NULL,
PRIMARY KEY (mascota_id),
FOREIGN KEY (persona_id) REFERENCES persona(persona_id)
);

-- Insertar datos en una tabla
-- Tienen que ser en el orden indicado
-- No se necesita colocar el id porque es auto incrementable 
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) values 
("Jonathan",'jonathan@gmail.com',23,'Feliz','1998-12-14'),
('Yair','yair@gmail.com',24,'Triste','1998-05-31');

-- Error 1062: Dato unico repetido
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) values 
('Pepe', 'yair@gmail.com', 34, 'Alegre', '1980-01-01');

-- Error 1364: No llenar un dato NOT NULL
INSERT INTO persona(correo, edad, estado, cumpleanios) values
('pepe@gmail.com',34,'Alegre','1980-01-01');

-- Ingresar datos que no son necesarios (No tiene el cumpleanios)
INSERT INTO persona(nombre, correo, edad, estado) values 
('Pepe', 'pepe@gmail.com', 34, 'Alegre');

-- Ingresar dato con valor por defecto (No tiene el estado)
INSERT INTO persona(nombre, correo, edad, cumpleanios) values
('Toño', 'ton@gmail.com', 40, '1970-10-10' );


