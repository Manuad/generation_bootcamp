const $card = document.querySelector('.card');
const $form = document.querySelector('form');

$form.addEventListener('submit', (e) => {
    e.preventDefault();
    const datos = Object.fromEntries(
        new FormData(e.target)
        );
    crearElemento(datos.url, datos.texto);
});

function crearElemento(url, texto) {
    const img = document.createElement("img");
    const textIn = document.createElement('figcaption');
    img.src = url;
    textIn.textContent = texto;

    textIn.textContent = texto;
    // appendChild
    $card.appendChild(img);
    $card.appendChild(textIn);
}
