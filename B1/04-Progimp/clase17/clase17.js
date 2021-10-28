//arrowFunctions
const suma = (num1, num2) => num1 + num2;
const resta = (num1, num2) => num1 - num2;
const division = (num1, num2) => num1 / num2;
const multiplicacion = (num1, num2) => num1 * num2;
const promedioTres = (num1) => {
    const res1 = sumar(num1, num1);
    const res2 = sumar(num1, res1);
    const resultado = division(res2, 3);
    return resultado;
};

//Callbacks y Arrow function.

//UNO Crear una función que convierta pulgadas en centímetros.
// Recibe por parámetro pulgadas y retorna su equivalente en centímetros.

const conversor = pulgadas => pulgadas * 2;

//DOS Crear una función que recibe un string y lo convierte en una una URL. 
// ej: “pepito” es devuelto como “http://www.pepito.com”
const conversor2 = string => "http://" + string;

//TRES Crear una función que recibe un string y devuelve la misma frase pero con admiración.
const conversor3 = string => string + "!";

//CUATRO Crear una función que calcule la edad de los perros, considerando que 1 año para nosotros son 7 de ellos.
const conversor4 = edad * 7;

//CINCO Crear una función que calcule el valor de tu hora de trabajo, introduciendo tu sueldo mensual como parámetro.
// Pd: considera que tu mes de trabajo tiene 40 horas.
const conversor5 = sueldo => sueldo / 40;

//SEIS Crear la función calculadorIMC() que reciba la altura en metros y el peso en kilogramos y calcule el imc de una persona. Luego, ejecutar la función probando diferentes valores.
const conversor6 = (alturaM, pesoK) => pesoK / (alturaM * alturaM);

//SIETE Crear una función que recibe un string en minúscula, lo convierta a mayúsculas y lo retorne. 
// Investiga que hace el método de strings .toUpperCase()
const conversor7 = stringMin => {
    const stringMay = stringMin.toUpperCase()
    return stringMay;
}

//OCHO Crear una función que recibe un parámetro y devuelve qué tipo de dato es ese parámetro. 
// pista: te servirá revisar que hace la palabra reservada typeof.
const conversor8 = tipeof

//NUEVE Crear una función que le pasamos el radio de un círculo y nos devuelve la circunferencia
// Pista: Investiga si el objeto Math tiene entre sus propiedades el número Pi