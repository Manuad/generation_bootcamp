class Pokemon {
    //atributos
    #nombre = '';
    #edad = 0;
    #evolucion = '';

    constructor(nombre, edad, evolucion) {
        this.#nombre = nombre;
        this.#edad = edad;
        this.#evolucion = evolucion;
    }

    //metodos

    get nombre() {
        return this.#nombre;
    }

    elegirPokemon() {
        const poke = document.getElementById('elegir');
        poke.innerHTML = `
        <div class='row p-5'>
            <div class='col-3'>
                <input type='button' class='btn btn-block btn-primary' value='Pikachu'/>
            </div>
            <div class='col-3'>
                <input type='button' class='btn btn-block btn-primary' value='Charmander'/>
            </div>
            <div class='col-3'>
                <input type='button' class='btn btn-block btn-primary' value='Bulbasaur'/>
            </div>
        </div>
        `;
    }

    atacar() {
        const poke = document.getElementById('pokemon');
        poke.innerHTML = `
        <h1>${this.#nombre} yo te elijo!</h1>
        `;
        return poke;
    }

    evolucionar() {
        const $EVOLUCION = this.#evolucion || '';
        let message = '';
        if($EVOLUCION) {
            message = `<h1>${this.#nombre} esta evolucionando a <strong class='bg-warning'>${$EVOLUCION}</strong></h1>`;
            this.#nombre = this.#evolucion;
            //console.log(pickachu);
        } else {
            message = `<h1>${this.#nombre} no evoluciona</h1>`;
        }
        return document.getElementById('evolucion').innerHTML = message;
    }
}
/*
const pikachu = new Pokemon('Pikachu', 10, 'Raichu', 'Electrico');
const charmander = new Pokemon('Charmander', 10, 'Charmeleon', 'Fuego');
const bulbasaur = new Pokemon('Bulbasaur', 10, 'Ivysaur', 'Agua');

pikachu.elegirPokemon();
pikachu.atacar();
pikachu.evolucionar();
*/ 

class TipoFuego extends Pokemon {
    #tipo = '';

    constructor(nombre, edad, evolucion) {
        super(nombre, edad, evolucion);
        this.#tipo = 'Fuego';
    }

    atacar() {
        return document.getElementById('pokemon').innerHTML = `
        <h1>${super.#nombre} yo te elijo!</h1>
        `;
    }
}

const charmander = new TipoFuego('Charmander', 10, 'Charmeleon');
console.log(charmander);
charmander.atacar();
