const db = [
    {
        URL: 'https://placeimg.com/200/200/animals',
        title: 'Animales',
        description: 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Ut id eos optio tenetur corrupti quisquam assumenda temporibus',
    },
    {
        URL: 'https://placeimg.com/200/200/tech',
        title: 'Tecnologia',
        description: 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Ut id eos optio tenetur corrupti quisquam assumenda temporibus',
    },
    {
        URL: 'https://placeimg.com/200/200/people',
        title: 'Personas',
        description: 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Ut id eos optio tenetur corrupti quisquam assumenda temporibus',
    },
    {
        URL: 'https://placeimg.com/200/200/nature',
        title: 'Naturaleza',
        description: 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Ut id eos optio tenetur corrupti quisquam assumenda temporibus',
    },
    {
        URL: 'https://placeimg.com/200/200/arch',
        title: 'Arquitectura',
        description: 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Ut id eos optio tenetur corrupti quisquam assumenda temporibus',
    },
    {
        URL: 'https://placeimg.com/200/200/grayscale',
        title: 'Animales',
        description: 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Ut id eos optio tenetur corrupti quisquam assumenda temporibus',
    },
    
];

const $cards = document.getElementById('cards');
$cards.innerHTML = '';

db.forEach(card => {
    $cards.innerHTML += `
    <div class="col mb-4">
        <div class="card">
            <img src="${card.URL}" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">${card.title}</h5>
                <p class="card-text">${card.description}</p>
                <a href="#" class="btn btn-primary">Go somewhere</a>
            </div>
        </div>
    </div>
    `;
});

const dbJSON = JSON.stringify(db);
console.log(dbJSON);
console.log(JSON.parse(dbJSON));