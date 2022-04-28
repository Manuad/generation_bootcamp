//Escribir un ciclo anidado que imprima el siguiente patrón:
// *
// * *
// * * *
// * * * *
// * * * * *
/*
for (let i = 1; i<=5; i++) {
    for (let j = 1; j<=i; j++) {
        document.write("*");
    }
    document.write("<br>");
}
*/
//Ejercicio 1

//Escribe un loop que haga lo siguiente:

//Repetidamente imprime el valor de la variable xValue, disminuyendo por 0.5 su valor cada iteración.
//El ciclo se mantendrá mientras que el valor de xValue sea positivo.
/*
let xValue = new Number(prompt("Ingrese un valor entre mayor a 0"));

for (let i = xValue; i>0; i-=0.5) {
    document.write(i + "<br>");
}
*/

//Ejercicio 2
//Imprime todos los números impares entre 1 y 100
/*
const num2 = 2;

for (let i = 0; i<=100; i++) {
    if (i%num2 == 0) {
        document.write(i+1 + "<br>");
    }
}
*/
//Ejercicio 3
//Escribe un ciclo while que imprima de 1 a n dentro de corchetes cuadrados
//Por ejemplo: si n = 6 imprime [1] [2] [3] [4] [5] [6]
/*
const numIn = new Number(prompt("Ingrese un número"));
let contador = 1;

while (contador <= numIn) {
    document.write("[" + contador + "]");
    contador++;
}
*/
//Ejercicio 4
//Escribe un ciclo que calcule la suma de los numeros positivos entre 1 y n
//ejemplo: n = 5 sum = 15     
//por que (1 + 2 + 3 + 4 + 5 )

let numIn = new Number(prompt("Ingrese un número"));

for (numIn ; numIn>0 ; numIn--) {
    document.write("<hr>" + numIn + "<hr>");
    
}

