let a = 35;
console.log(a + "dos");

console.log("10" / 2);

console.log(2 * "a");

// console.log(saludo());
// let saludo = function() {
//     return "hola";
// }

let contador = 0;
contador++;
console.log("el contador es: " + contador);

console.log(5 + 3 === 8 || (5 - 3 == "6" && 12 !== "12"));


// let edad = 18;
// if (edad) {
//     console.log("es mayor");
// } else {
//     console.log("es menor");
// }

let edad = 18;
let resultado = edad > 18 ? "puede pasar" : "no puede";
console.log(resultado)

//Crear una función llamada dividir, que reciba dos parámetros y 
// realice la división del primero con el segundo. 
// En caso de que el segundo parámetro sea 0 deberá retornar 
// "No se puede dividir por 0", 
// caso contrario, deberá retornar el resultado de la división.

//LINEA 41. NO DECLARAR ANTES DE COMPROBAR SI EL NUMERO ES CERO
function dividir(a, b) {
    let resultado = "";
    let division = a / b;
    if (b !== 0) {
        resultado = "El resultado es: " + division;
    } else {
        resultado = "No se puede dividir por 0.";
    }
    return resultado;
}
console.log(dividir(20, 0));

function dividir(a, b) {
    let resultado = "";
    if (b !== 0) {
        let division = a / b;
        resultado = "El resultado es: " + division;
    } else {
        resultado = "No se puede dividir por 0.";
    }
    return resultado;
}
console.log(dividir(20, 0));