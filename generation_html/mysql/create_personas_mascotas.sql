/*Crear DB*/

CREATE DATABASE familia;
USE familia;

/*Crear tabla de persona*/
CREATE TABLE persona(
persona_id int auto_increment,
nombre varchar(255) NOT NULL,
correo varchar(255) NOT NULL,
edad int NOT NULL,
estado varchar(255) NOT NULL, 
cumpleanios date NOT NULL,
primary key (persona_id),
CONSTRAINT correo_unico UNIQUE(correo)
);

/*Crear tabla de mascota*/
CREATE TABLE mascota(
mascota_id int auto_increment,
persona_id int NOT NULL,
nombre varchar (255) NOT NULL,
edad int NOT NULL,
PRIMARY KEY (mascota_id),
FOREIGN KEY (persona_id) REFERENCES persona(persona_id)
);