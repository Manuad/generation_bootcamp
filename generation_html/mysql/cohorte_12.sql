/*
CREATE DATABASE generation_bootcamp;
*/
USE generation_bootcamp;
/*Students table*/
CREATE TABLE alumno (
alumno_id int unique NOT NULL auto_increment,
nombre varchar(60) NOT NULL,
amonestaciones int,
apellidos varchar(60) NOT NULL,
nivel_ingles enum('A1', 'A2', 'B1', 'B2', 'C1', 'C2') NOT NULL,
edad date NOT NULL,
curp varchar(17) unique,
rfc varchar(13) unique,
primary key (alumno_id) 
);

/*team table*/
CREATE TABLE equipo (
equipo_id int unique NOT NULL auto_increment,
alumno_id int NOT NULL,
cantidad_integrantes int NOT NULL,
nombre varchar(60),
logo varchar(255),
primary key (equipo_id),
FOREIGN KEY (alumno_id) REFERENCES alumno(alumno_id)
);

/*Instructors table*/
CREATE TABLE instructor(
instructor_id int unique NOT NULL auto_increment,
sesiones enum('BSM', 'EES', 'SSM', 'TSL', 'R&R', 'SAP', 'COM'),
nombre varchar(60),
apellidos varchar(60), 
supervisor_id int,
rfc varchar(13) unique,
edad int,
cumpleaños date,
PRIMARY KEY (instructor_id)
);

/*Dirección*/
drop table if exists direccion;
CREATE TABLE direccion (
direccion_id int unique NOT NULL auto_increment,
alumno_id int NOT NULL,
calle varchar(150) NOT NULL,
pais varchar(80) NOT NULL,
cp varchar(11) NOT NULL,
primary key (direccion_id),
foreign key (alumno_id) REFERENCES alumno(alumno_id)
);

CREATE TABLE cohorte12 (
cohorte12_id int unique NOT NULL auto_increment,
alumno_id int NOT NULL,
instructor_id int NOT NULL,
tipo_sesiones varchar(255),
numero_alumnos int NOT NULL,
horario time,
ciudad char(3) NOT NULL,
primary key (cohorte12_id),
FOREIGN KEY (alumno_id) REFERENCES alumno(alumno_id),
FOREIGN KEY (instructor_id) REFERENCES instructor(instructor_id)
);