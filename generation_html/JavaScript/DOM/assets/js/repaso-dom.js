const $padre = document.querySelector('.padre');

const $parr = document.createElement('p');
$parr.textContent = 'Hola soy un párrafo';
$parr.textContent += ' y soy hijo de un div';
$parr.textContent += ' Lorem Impsum';

$padre.appendChild($parr);

// Language: javascript
// Path: generation_html\JavaScript\DOM\assets\js\repaso-dom.js
const $cuadro = document.querySelector('.cuadro');
$cuadro.innerHTML = '';
$cuadro.innerHTML = '<a href="#">Hola soy un cuadro</a>';


/**
 * Language: javascript
 * Path: generation_html\JavaScript\DOM\assets\js\repaso-dom.js
 */

const estaciones = ['primavera', 'verano', 'otoño', 'invierno'];
const $lista = document.createElement('ul');

estaciones.forEach(estacion => {
    const $li = document.createElement('li');
    $li.textContent = estacion;
    $lista.appendChild($li);
    $lista.style.listStyle = 'none';
});

document.body.appendChild($lista);

// Language: javascript
// Path: generation_html\JavaScript\DOM\assets\js\repaso-dom.js
const continentes = ['Africa', 'America', 'Asia', 'Europa'];
const $ol = document.createElement('ol');

continentes.forEach(continente => {
    $ol.innerHTML += `<li>${continente}</li>`;
});

$cuadro.appendChild($ol);