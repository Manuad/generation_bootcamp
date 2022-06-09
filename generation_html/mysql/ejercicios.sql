-- USE sakila
USE sakila;

-- USE tienda
USE tienda;

SHOW TABLES;

-- Ejercicio 1
/* 
JOIN de ejemplo
SELECT 
	categoria.nombre AS categoria, 
    producto.nombre as producto 
FROM producto p INNER JOIN categoria c ON categoria.idCategoria = producto.idCategoria;
*/
USE sakila;
SELECT * FROM sakila.film;

-- 1) Seleccionar los títulos de las peliculas, con el idioma que tienen
SELECT 
	film.title AS titulo_filme, 
    `language`.`name` AS idioma
FROM `language` INNER JOIN film ON film.language_id = `language`.language_id;

-- 2) Seleccionar que actores han trabajado en peliculas francesas
SELECT
	

SELECT
    country.country_id as id_pais,
    city.city_id as ciudad_id,
    country.country as pais,
    city.city as ciudad,
    address.address as direccion
FROM country
INNER JOIN city ON city.country_id = country.country_id
INNER JOIN address ON address.city_id = city.city_id ORDER BY ciudad_id asc;

SELECT * FROM sakila.country;
SELECT 
	title.name AS title, 
    language_id 
FROM film;

-- Ejercio 2


