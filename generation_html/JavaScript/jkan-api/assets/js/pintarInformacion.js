const idInfo = window.location.href.split('=').pop();

//console.log(idInfo);

const urlId = `https://api.jikan.moe/v4/anime/${idInfo}`;
const imagenPortada = document.getElementById('imagenPortada');

fetch(urlId).then(response => response.json()).then(datos => {
    console.log(datos);

    const datosNecesarios = {
        id: datos.data.mal_id,
        imagen: datos.data.images.jpg.large_image_url,
        sinopsis: datos.data.synopsis,
        nombre: datos.data.title,
    }
    //INSERT Image
    const templateImg = `<img src="${datosNecesarios.imagen}" class="img-fluid" alt="${datosNecesarios.nombre}">`;
    imagenPortada.innerHTML = templateImg;

    //Insert info
    const templateInfo = `
    <h1>${datosNecesarios.nombre}</h1>
    <p>${datosNecesarios.sinopsis}</p>
    <input class="btn btn-dark" type="button" value="Agergar a favoritos">
    `;
    informacionAnime.innerHTML = templateInfo;
});