// forma clásica
function sumar(a, b) {
    return a + b;
}
console.log(sumar(2, 4)); // 6

// ES6 arrow function
let sumar = (a, b) => a + b;

console.log(sumar(2, 4)); // 6

//Una función simple que podríamos programar de la manera habitual: 
//una suma de dos números.
function sumar(a, b) { return a + b };

//Ahora veamos la versión reducida de esa misma función, al transformarla en una función arrow.
let sumar = (a, b) => a + b;

//Las funciones arrow son siempre anónimas. Es decir, que no tienen nombre como las funciones normales.
(a, b) => a + b;

//Si queremos nombrarlas, es necesario escribirlas como una función expresada. 
//Es decir, asignarla como valor de una variable.
let sumar = (a, b) => a + b;

//Parámetros de una función arrow
//Si recibe un único parámetro, podemos prescindir de los paréntesis.
let doble = a => a * 2;

//Cuerpo de una función arrow
//si la función tiene una sola línea de código, y esta misma es la que hay que retornar, no hacen falta las llaves ni la palabra reservada return.
let sumar = (a, b) => a + b;

//De lo contrario, vamos a necesitar utilizar ambas. 
//Eso normalmente pasa cuando tenemos más de una línea de código en nuestra función.
let esMultiplo = (a, b) => {
    let resto = a % b; // Obtenemos el resto de la div.
    return resto == 0; // Si el resto es 0, es múltiplo
};

//------------------------

//{código}
let saludo = () => 'Hola Mundo!';
//Función arrow sin parámetros.
//Requiere de los paréntesis para iniciarse.
//Al tener una sola línea de código, y que esa misma sea la que queremos retornar, el return queda implícito.


let dobleDe = numero => numero * 2;
//un único parámetro (no necesitamos los paréntesis) 
//con un return implícito.

let suma = (a, b) => a + b;
//Función arrow con dos parámetros.
//Necesita de los paréntesis y 
//tiene un return implícito.

let horaActual = () => {
        let fecha = new Date();
        return fecha.getHours() + ':' + fecha.getMinutes();
    }
    //Función arrow sin parámetros y 
    //con un return explícito.
    //Hacemos uso de las llaves y del return, 
    //ya que se desarrolla en más de una línea de código.

//----------
//cambiarle la sintaxis y volver a escribirlas para que sean funciones de tipo arrow.
function dameCinco() {
    return [1, 2, 3, 4, 5];
}

function multiplicarPorDos() {
    return 123 * 2;
}

function mostrarNombre() {
    return "Mi nombre es Hernán";
}

let dameCinco = () => {
    return [1, 2, 3, 4, 5];
}
let multiplicarPorDos = () => { return 123 * 2 }

let mostrarNombre = () => { return "Mi nombre es Hernán"; }

//refactorizar la función saludar() que recibe un parámetro, es decir, escribirla con la sintaxis necesaria para convertirla en una arrow function.
function saludar(nombre) {
    return 'Hola, ' + nombre + '!';
}
let saludar = nombre => 'Hola, ' + nombre + '!';

//Tomemos la función saludar(), que esta vez recibe un nombre y un apellido, y veamos de convertirla en una arrow function.
function saludar(nombre, apellido) {
    return 'Hola, ' + nombre + ' ' + apellido + '!';
}