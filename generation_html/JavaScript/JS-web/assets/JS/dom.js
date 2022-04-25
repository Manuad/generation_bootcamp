/**
 * Algunas cosas que podemos hacer con DOM
 */

console.log(window.document);
console.log(document);
console.log(document.body);
console.log(document.documentElement);
console.log(document.links);
console.log(document.images);
console.log(document.styleSheets);
console.log(document.scripts);
setTimeout(() => {
    console.log(document.getSelection().toString());
}, 3000);
setTimeout(() => {
    document.write("Hola mundo desdes el DOM");
}, 3000);