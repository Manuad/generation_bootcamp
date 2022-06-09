-- Actualizar

-- Agregar columna
ALTER TABLE mascota ADD COLUMN especie VARCHAR(255) NOT NULL;

-- Agregar una columna en la posición específica
ALTER TABLE mascota ADD COLUMN cumpleanios DATE AFTER edad;

-- Modificar las características de una columna
ALTER TABLE mascota MODIFY cumpleanios VARCHAR(255) NOT NULL;

-- No es posible cambiar el nombre de una columna
ALTER TABLE mascota CHANGE COLUMN edad edadP int NOT NULL;

-- Renombrar la tabla
ALTER TABLE mascota RENAME mascotita;

-- Actualizar datos de una fila
UPDATE mascotita SET especie = "Gato" WHERE mascota_id = 1;

-- Isertando datos en mascotas
UPDATE mascotita ;

SELECT * FROM mascota;