let nombre = "Natalia";
console.log(nombre[7]); //hardcoding
console.log(nombre[nombre.length - 1]);

//slice 
let frase = 'Breaking Bad Rules!';

console.log(frase.slice(9, 12)); // devuelve 'Bad'
console.log(frase.slice(13)); // devuelve 'Rules!'
console.log(frase.slice(-10)); // ¿Qué devuelve? ¡A investigar!

//Strings y Arrays
// Obtenemos un array de correos a los cuales deberemos realizar una serie de verificaciones para corroborar si son válidos, para ello en cada elemento debemos buscar el carácter @, por el momento, y agregarlos al array de correos admitidos, de lo contrario se deberá agregar al array de correos Descartados.
// Desarrollar una función que realice la verificación de cada elemento del array de correos pendientes, en caso de validar agregar al arrayCorreoAdmitidos, caso contrario agregar al arrayCorreoDescartados .
// mostrar por pantalla la cantidad y los elementos de cada array

let arrayCorreosPendientes = [
    'iroman@digitalhouse.com', 'loki%digitalhouse.com', 'loki@digitalhouse.com', 'thanosdigitalhouse.com', 'thanos@digitalhouse.com'
];


/* array de correos admitidos */

let arrayCorreosAdmitidos = [
    'thor@digitalhouse.com',
    'tucuMan@digitalhouse.com',
    'wanda@digitalhouse.com'
];
let arrayCorreosDescartados = [];

function verificarCorreo(correo) {
    //tu código   
}

console.log("--- Array de correos admitidos: " + "longitud de array" + " ---");
console.log(arrayCorreosAdmitidos);
console.log();
console.log("---Array de correos Descartados:" + "longitud de array" + " ---");
console.log(arrayCorreosDescartados);