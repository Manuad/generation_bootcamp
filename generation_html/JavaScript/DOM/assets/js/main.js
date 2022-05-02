const $titulo = document.querySelector('h1');
const $parrafo = document.querySelector('p');
const $card = document.querySelector('.card');

//nodeName
console.log($parrafo.nodeName);
console.log($titulo.nodeName);

//textContent
console.log($parrafo.textContent);
$parrafo.textContent += "¡Hola Mundo!";

$titulo.textContent = 'Modificando elementos con JavaScript';

//innerText - mejor no usarla

//innerHTML
console.log($parrafo.innerHTML);

$parrafo.innerHTML = '<a href="#">Este es un enlace</>';
// Reemplaza lo que hay adentro del elemento seleccionado

//outerHTML
//$parrafo.outerHTML = '<a href="#">Este es un enlace</>';
// Reeemplaza todo incluido el elemento que seleccionamos

// Crear elementos de HTML
console.log(document);

function crearElemento() {
    const img = document.createElement("img");
    img.src = "https://www.comedera.com/wp-content/uploads/2017/08/tacos-al-pastor-receta.jpg"
    // appendChild
    $card.appendChild(img);
  }
  
  crearElemento();
  