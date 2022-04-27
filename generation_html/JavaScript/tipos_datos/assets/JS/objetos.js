const nombre = "Juan"; // string
const nombre2 = new String("Manuel"); // Objeto del tipo String
const persona = new Object(); // Objeto vacio
persona.nombre = "Juan";
persona.apellido = "Perez";
persona.edad = 30;

console.log(nombre);
console.log(persona);

const nuevaPersona = {
    nombre: "Juan",
    apellido: "Perez",
    edad: 30,
    pasaTiempos: ['Nadar', 'Correr', 'Dormir'],
    tieneTrabajo: true,
    saludar: function() {
        console.log(`Hola, soy ${this.nombre}`);
    },
    sumar: function(a, b) {
        return console.log(`El resultado de la suma es: ${a + b}`);
    },
    colorFavorito: '#FF0000',
    mostrarColor: function() {
        let divColor = document.createElement('div', {style: `background-color: ${this.colorFavorito}; width: 100px; height: 100px;`});
    }
};

console.log(nuevaPersona);
nuevaPersona.sumar(5, 986569);

const manuManito = {
    nombreCompleto: {
        nombre: "Manuel Adán",
        apellido: "Carrillo Zavala"
    },
    edad: 29,
    pasaTiempos: ['leer', 'Tomar cafésito', 'Estar en casa', 'Echar chismecito'],
}

const santiago = {
    nombreCompleto: {
        nombre:"carlos",
        apellido:"cruz",
    },
    edad: 29,
    pasaTiempos: ["futbol", "estudiar", "anime"],    
}

const Arantxa = { 
    nombreCompleto: {
    nombre: "Arantxa", 
    apellido: "Perez"
    },
    edad: 26,
    pasaTiempos: ["caminar", "patinar", "musica"]
}

const miriam ={
    /* atributos o propiedades: datos*/
    nombreCompleto:{ 
    nombre: "aketzali",apellido: "gonzalez"},
    edad: "23",
    pasaTiempos: ["pintar","leer","escribir"]
}

const cohorte12 = [manuManito, santiago, Arantxa, miriam];

for (let i = 0; i < cohorte12.length; i++) {
    if(cohorte12[i].pasaTiempos.includes('leer')) {
        console.log(`${cohorte12[i].nombreCompleto.nombre} ${cohorte12[i].nombreCompleto.apellido}`);
    }
}