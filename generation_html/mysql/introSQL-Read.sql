-- Ordenar 
SELECT * FROM city ORDER BY country_id ASC;

/* Operadores de comparación: 
	Igual       =
    Diferente   !=
    Menor       <
    Mayor       >
    COMO        like
    
*/

SELECT * FROM city WHERE city = "CUMAN";
SELECT * FROM actor WHERE first_name = 'PENELOPE';
SELECT * FROM actor WHERE first_name != 'PENELOPE';
SELECT * FROM actor WHERE actor_id < 35;
SELECT * FROM actor WHERE first_name LIKE 'Penel';

SELECT ¨FROM actor WHERE first_name LIKE 
