const url = 'https://dog.ceo/api/breeds/image/random';
const image = document.getElementById('dog-img');
const image2 = document.getElementById('dog-img2');

fetch(url).then(response => response.json()).then(data => {
    console.log(data);
    image.src = data.message;
});

async function fetchDog() {
    const infoPerritos = await fetch(url);
    const perrito = await infoPerritos.json();
    console.log(perrito);
    image2.src = perrito.message;
}

fetchDog();