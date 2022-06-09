USE world;
SELECT 5 + 5;
SELECT * FROM country;

SELECT `code`, `name`, population FROM country WHERE population > 50000000 && population < 70000000 ORDER BY `code` ASC;
SELECT `code`, `name`, population, region, continent, surfacearea, LifeExpectancy FROM country WHERE continent = 'North America' && population > 50000000 ORDER BY LifeExpectancy ASC;

-- IN nos permite especificar condiciones
SELECT `code`, `name`, region, continent, surfacearea, LifeExpectancy, GNP FROM country WHERE continent = 'North America' OR region = 'Caribean' ORDER BY LifeExpectancy ASC;
SELECT `code`, `name`, region, continent, surfacearea, LifeExpectancy, GNP, (SELECT GNP FROM country WHERE GNP > 100000) AS economies FROM country WHERE continent IN ('North America', 'Asia', 'Oceania') OR region IN ('Caribean', 'Central America') ORDER BY GNP ASC;

-- LIKE nos permite buscar un patrón específico
/*
  Con '_' se especifíca el primer caracter,
  Con '%' se busca cualquier cantidad de caracteres
*/

-- Select count
USE sakila;
SELECT COUNT(distinct customer_id) from payment;

-- Select SUM
SELECT SUM(amount) as total FROM payment;

SHOW TABLES;
describe actor;
SELECT SUM(amount) as TOTAL FROM payment WHERE staff_id = 2;

-- AVG() Esta función nos permite tener un promedio de cantidades en una columna
SELECT AVG(amount) AS promedio FROM payment WHERE customer_id = 526;
SELECT * FROM payment;
SELECT customer_id, SUM(amount) AS total FROM payment GROUP BY customer_id order by total desc;


-- Subquerys

SELECT * FROM film WHERE language_id = (SELECT `name`  FROM `language`);
USE tienda;
-- Joins                                              tabla secundaria                 tabla primaria  
SELECT 
	categoria.nombre AS categoria, 
    producto.nombre as producto 
FROM producto p INNER JOIN categoria c ON categoria.idCategoria = producto.idCategoria;

