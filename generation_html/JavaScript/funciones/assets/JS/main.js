/**
 * Las funciones nos permiten reutilizar código.
 * El hoisting nos permite que las funciones sean utilizadas antes de ser declaradas.
 */
const button = document.querySelector('#saludar');
button.addEventListener('click', () => {
    saludo('Manuel', 'Gonzalez');
});

function saludo(nombre, apellido) {
    //let nombre = prompt('Ingrese su nombre');
    const button = document.getElementById('saludar');
    button.style.backgroundColor = 'green';
    button.style.color = 'white';
    //Template string es una forma de escribir strings con interpolación de variables
    //console.log(`Hola mi nombre es: ${nombre ? "Manuel" : 'Desconocido'}`);
    /*
    console.log('Hola mi nombre es:', nombre, apellido);
    alert("Hola", nombre, apellido);
    document.write(`
        <style>
        a {
            font-size: 20px;
            text-decoration: none;
            color: black;
        }
        </style>
        <h2>Ya te salude bro ${nombre + " "+ apellido}</h2>
        <a href="http://127.0.0.1:5500/generation_html/JavaScript/funciones/index.html">Regresar a programar no, andes de flojo xD</a>
        <script>
            const nombre = prompt("Hola, escribe tu nombre:");
        </script>
    `);
    */
   return `Hola mi nombre es: ${nombre ? "Manuel" : 'Desconocido'}`, `Hola mi apellido es: ${apellido ? "Gonzalez" : 'Desconocido'}`;
}

/**
 * Funciones declaradas
 */

function suma (a, b) {
    return a + b;
}

console.log(suma(1, 2));

/**
 * Funciones expresadas
 */

const suma2 = function (a, b) {
    return a + b;
};

console.log(suma2(1, 2));

/**
 * Arrow functions
 */

const multiplicar = (a, b) => {
    return a * b;
};

console.log(multiplicar(1, 2));
